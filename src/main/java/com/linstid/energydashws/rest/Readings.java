package com.linstid.energydashws.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
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
	@Path("/range/{start}&{end}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReadingEntity> getReadingRange() {
		List<ReadingEntity> response = new ArrayList<ReadingEntity>();
		return response;
	}

}
