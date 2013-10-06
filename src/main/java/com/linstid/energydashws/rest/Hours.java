package com.linstid.energydashws.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/Hours")
public class Hours {
	@Context
	private UriInfo context;

	public Hours() {

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getHoursRange() {
		return "{ a: 'b' }";
	}

}
