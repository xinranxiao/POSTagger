package com.xxiao.pos.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by xxiao on 8/2/14.
 */
@Path("/api/v1/tagger")
public class TaggerResource {
  public void TaggerResource() {
  }

  @GET
  public Response getTagsFor() {
    return Response.ok().build();
  }
}
