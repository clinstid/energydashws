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
import com.linstid.energydashws.entities.HoursPerDayOfWeek;
import com.linstid.energydashws.persistence.MongodbPersistence;

// import org.jboss.logging.Logger;

@Path("/hours_per_day_of_week")
public class HoursPerDOW {
	@Context
	private UriInfo context;

	// private Logger logger;

	public HoursPerDOW() {
		// this.logger = Logger.getLogger(this.getClass());
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HoursPerDayOfWeek> getHoursPerDOW() {
		System.out.println("Getting days of week...");
		MongodbPersistence db = new MongodbPersistence();
		return db.getHoursPerDayOfWeek();
	}

	@GET
	@Path("/day/{dayName}")
	@Produces(MediaType.APPLICATION_JSON)
	public HoursPerDayOfWeek getHoursPerDOWForSpecificDay(
			@PathParam("dayName") String dayName) {
		System.out.println("getting day average for " + dayName);

		MongodbPersistence db = new MongodbPersistence();
		return db.getHoursForSpecificDayOfWeek(dayName);
	}
}
