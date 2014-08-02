package com.xxiao.pos.models;

/**
 * Created by xxiao on 8/2/14.
 */
public class TaggingResult {
  private String[] words;
  private String[] results;

  public TaggingResult(String[] words, String[] results) {
    this.words = words;
    this.results = results;
  }

  public static TaggingResult of(String[] words, String[] results) {
    return new TaggingResult(words, results);
  }
}
