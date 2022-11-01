package com.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("")
@ApplicationPath("/calc")
public class CalculatorService extends Application 
{
	@GET
	@Path("/add/{A}/{B}")
	@Produces(MediaType.APPLICATION_JSON)
	public String add(@PathParam("A") int A, @PathParam("B") int B)
	{
		Integer C = A + B;
		return C.toString();
	}
	
	@POST
	@Path("/sub/{A}/{B}")
	@Produces(MediaType.APPLICATION_JSON)
	public String subtract(@PathParam("A") int A, @PathParam("B") int B)
	{
		Integer C = A - B;
		return C.toString();
	}
}
