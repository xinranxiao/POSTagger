package com.xxiao.pos.tagger;
import com.google.inject.Singleton;
import com.xxiao.pos.models.TaggingResult;

import java.io.*;
import java.util.*;

/**
 * Part of speech tagging using the viterbi algorithm and HMM's. Based off of Chris Bailey-Kellogg's teaching at Dartmouth.
 *
 * @author Xinran Xiao
 */
@Singleton
public class POSTagger {
  private Map<String,Map<String,Double>> emissions;	// Map<state, Map<word, score>>
  private Map<String,Map<String,Double>> transitions; // Map<state, Map<state, score>>

  public POSTagger () {
    ArrayList<String[]> trainingWords = parseWords();
    ArrayList<String[]> trainingTags = parseTags();

    train(trainingWords, trainingTags);
  }

  private ArrayList<String[]> parseWords() {
    return null;
  }

  private ArrayList<String[]> parseTags() {
    return null;
  }

  private void train(ArrayList<String[]> words, ArrayList<String[]> tags) {

  }

  public TaggingResult tag(String input) {
    String[] words = input.split(" ");
    String[] results = {};

    return TaggingResult.of(words, results);
  }
}