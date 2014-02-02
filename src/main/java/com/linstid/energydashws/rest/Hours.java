package com.linstid.energydashws.rest;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.linstid.energydashws.entities.HoursEntity;
import com.linstid.energydashws.persistence.MongodbPersistence;

// import org.jboss.logging.Logger;

@Path("/hours")
public class Hours {
	@Context
	private UriInfo context;

//	private Logger logger;
	
	public Hours() {
//		this.logger = Logger.getLogger(this.getClass());
	}

	@GET
	@Path("/last")
	@Produces(MediaType.APPLICATION_JSON)
	public HoursEntity getLastHour() {
		System.out.println("Getting last hour...");
		MongodbPersistence db = new MongodbPersistence();
		return db.getLastHour();
	}

	@GET
	@Path("/range/start={start}&end={end}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HoursEntity> getHoursRange(@PathParam("start") String start, @PathParam("end") String end) {
//		logger.info("getting hours for " + start + " --> " + end);
		System.out.println("getting hours for " + start + " --> " + end);
		
		Date startDate = new Date();
		Date endDate = new Date();
		
		try {
			startDate.setTime(Long.parseLong(start));
		} catch (NumberFormatException e) {
			String err = "Failed to parse start date of " + start + ": " + e;
//			logger.error(err);
			System.out.println(err);
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		try {
			endDate.setTime(Long.parseLong(end));
		} catch (NumberFormatException e) {
			String err = "Failed to parse end date of " + end + ": " + e;
//			logger.error(err);
			System.out.println(err);
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		
		MongodbPersistence db = new MongodbPersistence();
		return db.getRangeOfHours(startDate, endDate);
	}

}
