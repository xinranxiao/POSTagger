package com.xxiao.pos.resources;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.xxiao.pos.models.TaggingResult;
import com.xxiao.pos.tagger.POSTagger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by xxiao on 8/2/14.
 */
@Path("/api/v1/tagger")
public class TaggerResource {
  private POSTagger tagger;

  @Inject
  public void TaggerResource(POSTagger tagger) {
    this.tagger = tagger;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public TaggingResult getTagsFor(@QueryParam("value") @DefaultValue("") String value) {
    return tagger.tag(value);
  }
}
