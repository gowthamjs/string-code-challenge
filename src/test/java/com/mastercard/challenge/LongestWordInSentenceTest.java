package com.mastercard.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestWordInSentenceTest {

	static LongestWordInSentence longestWordInSentence = new LongestWordInSentence();
	static String inputSentence, expectedLongestWord, actualLongestWord;

	/*
	 * Test case to validate the longest word, if the input sentence contains
	 * only one largest word.
	 */
	@Test
	public void shouldReturnLongestWordInSentence() {
		inputSentence = "The cow jumped over the moon.";
		actualLongestWord = LongestWordInSentence.findLargestWord(inputSentence);
		expectedLongestWord = "jumped";
		validateLongestWordInSentence(expectedLongestWord, expectedLongestWord.length(), actualLongestWord,
				actualLongestWord.length());
	}

	/*
	 * Test case to validate the longest word, if the input sentence is just an
	 * empty string.
	 */
	@Test
	public void shouldReturnEmptyWord() {
		inputSentence = "";
		actualLongestWord = LongestWordInSentence.findLargestWord(inputSentence);
		expectedLongestWord = "";
		validateLongestWordInSentence(expectedLongestWord, expectedLongestWord.length(), actualLongestWord,
				actualLongestWord.length());
	}

	/*
	 * Test case to validate the longest word, if the input sentence has just
	 * one single word.
	 */
	@Test
	public void shouldReturnInputSentence() {
		inputSentence = "Challenge";
		actualLongestWord = LongestWordInSentence.findLargestWord(inputSentence);
		expectedLongestWord = "Challenge";
		validateLongestWordInSentence(expectedLongestWord, expectedLongestWord.length(), actualLongestWord,
				actualLongestWord.length());
	}

	private void validateLongestWordInSentence(String expectedLongestWord, int expectedLongestwordLength,
			String actualLongestWord, int actualLongestWordLength) {
		assertEquals("Actual longest word is different than expected word", expectedLongestWord, actualLongestWord);
		assertEquals("Length of longest word is different than expected word length", expectedLongestwordLength,
				actualLongestWord.length());
	}

}
