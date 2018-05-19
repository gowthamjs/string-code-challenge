package com.mastercard.challenge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LongestWordInSentence {
	private static final Logger logger = LogManager.getLogger(LongestWordInSentence.class);

	public static void main(String[] args) {
		String largestString = findLargestWord("This is the longest word");
		logger.info("Longest word in the string={} and its size={}", largestString, largestString.length());
	}

	public static String findLargestWord(String inputSentence) {

		if (inputSentence.isEmpty()) {
			return "";
		}

		String[] wordsInSentence = inputSentence.split("\\W+");

		if (wordsInSentence.length == 1) {
			return inputSentence;
		}

		int longestWordLength = 0;
		String longestWord = "";
		for (int i = 0; i < wordsInSentence.length; i++) {
			if (wordsInSentence[i].length() > longestWordLength) {
				longestWordLength = wordsInSentence[i].length();
				longestWord = wordsInSentence[i];
			}
		}
		return longestWord;
	}
}
