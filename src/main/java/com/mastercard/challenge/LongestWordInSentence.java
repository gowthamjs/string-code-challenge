package com.mastercard.challenge;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LongestWordInSentence {
	private static final Logger logger = LogManager.getLogger(LongestWordInSentence.class);

	public static void main(String[] args) {
		List<String> longestStringList = findLargestWord("The cow jumped over the moon.");

		logger.info(
				"Number of longest words in the input sentence is={} and the word(s) is/are: {} and the length of longest word is {}",
				longestStringList.size(), longestStringList, longestStringList.get(0).length());
	}

	public static List<String> findLargestWord(String inputSentence) {
		List<String> wordsList = new LinkedList<>();
		List<String> longestWordsList = new LinkedList<>();
		if (inputSentence.isEmpty()) {
			return Collections.emptyList();
		}

		for (String word : inputSentence.split("\\W+")) {
			wordsList.add(word);
		}

		if (wordsList.size() == 1) {
			return wordsList;
		}

		Collections.sort(wordsList, new Comparator<String>() {

			@Override
			public int compare(String wordOne, String wordTwo) {
				int wordOneLength = wordOne.length();
				int wordTwoLength = wordTwo.length();
				if (wordOneLength > wordTwoLength) {
					return -1;
				} else if (wordTwoLength > wordOneLength) {
					return 1;
				} else
					return 0;
			}
		});

		for (int i = 0; i < wordsList.size(); i++) {
			if (i + 1 >= wordsList.size() || wordsList.get(i).length() == wordsList.get(i + 1).length()) {
				longestWordsList.add(wordsList.get(i));
			} else if (wordsList.get(i).length() != wordsList.get(i + 1).length()) {
				longestWordsList.add(wordsList.get(i));
				break;
			}
		}

		return longestWordsList;
	}
}
