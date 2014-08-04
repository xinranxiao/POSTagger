package com.xxiao.pos.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by xxiao on 8/3/14.
 */
@Path("/")
public class MainResource {
  @GET
  public Response hi() {
    return Response.status(200).entity("Use /api/v1/tagger for the tagger.").build();
  }
}
