package com.xxiao.pos.tagger;
import com.google.common.collect.Maps;
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
  private static final String TRAINING_WORDS_PATH = "src/main/resources/brown-words.txt";
  private static final String TRAINING_TAGS_PATH = "src/main/resources/brown-tags.txt";
  private static final int MAX_LINES = 10000;

  private Map<String,Map<String,Double>> emissions;	// Map<state, Map<word, score>>
  private Map<String,Map<String,Double>> transitions; // Map<state, Map<state, score>>

  public POSTagger () {
    train();
  }

  private void train() {
    Map<String[], String[]> trainingData = parseTrainingData();
  }

  private Map<String[], String[]> parseTrainingData() throws IOException {
    Map<String[], String[]> trainingData = Maps.newHashMap();

    BufferedReader wordsIn = new BufferedReader(new FileReader(TRAINING_WORDS_PATH));
    BufferedReader tagsIn = new BufferedReader(new FileReader(TRAINING_TAGS_PATH));

    String wordLine, tagLine;
    int n = 0;
    while (n < MAX_LINES) {
      wordLine = wordsIn.readLine();
      tagLine = tagsIn.readLine();

      if (wordLine == null || tagLine == null) {
        break;
      }

      String[] words = wordLine.toLowerCase().split(" ");
      String[] tags = tagLine.split(" ");

      if (words.length != tags.length) {
        continue;
      }

      trainingData.put(words, tags);
      n++;
    }

    wordsIn.close();
    tagsIn.close();

    return trainingData;
  }

  public TaggingResult tag(String input) {
    String[] words = input.split(" ");
    String[] results = {};

    return TaggingResult.of(words, results);
  }


}