package com.xxiao.pos.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by xxiao on 8/2/14.
 */
public class TaggingResult {
  @JsonProperty
  private String[] words;

  @JsonProperty
  private String[] results;

  public TaggingResult(String[] words, String[] results) {
    this.words = words;
    this.results = results;
  }

  public static TaggingResult of(String[] words, String[] results) {
    return new TaggingResult(words, results);
  }
}
