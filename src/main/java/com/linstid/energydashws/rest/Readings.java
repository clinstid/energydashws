package com.linstid.energydashws.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.linstid.energydashws.entities.ReadingEntity;
import com.linstid.energydashws.persistence.MongodbPersistence;


@Path("/readings")
public class Readings {
	@Context
	private UriInfo context;
	
	public Readings() {
	}
	
	@GET
	@Path("/last")
	@Produces(MediaType.APPLICATION_JSON)
	public ReadingEntity getLastReading() {
		System.out.println("Getting last reading...");
		MongodbPersistence db = new MongodbPersistence();
		return db.getLastReading();
	}
	
	@GET
	@Path("/range/start={start}&end={end}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReadingEntity> getReadingRange(@PathParam("start") String start, @PathParam("end") String end) {
		System.out.println("getting readings for " + start + " --> " + end);
		
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
		return db.getRangeOfReadings(startDate, endDate);
	}
}
