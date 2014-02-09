package com.linstid.energydashws.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.linstid.energydashws.entities.HoursInDayEntity;
import com.linstid.energydashws.persistence.MongodbPersistence;

// import org.jboss.logging.Logger;

@Path("/hours_in_day")
public class HoursInDay {
	@Context
	private UriInfo context;

//	private Logger logger;
	
	public HoursInDay() {
//		this.logger = Logger.getLogger(this.getClass());
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HoursInDayEntity> getHoursInDay() {
//		logger.info("getting hours for " + start + " --> " + end);
		System.out.println("getting hours in day");
		
		MongodbPersistence db = new MongodbPersistence();
		return db.getHoursInDay();
	}

}
