package com.kamala.campaign.AdTest1;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Produces({ "application/xml", "application/json" })
public interface adService {

	@GET
	@Path("/partner/{id}")
	public abstract adInfo getAd(@PathParam("id") String id); // http get

	@POST
	@Path("/partner/")
	public abstract Response createtAd(adInfo adInfo); // http post

}
