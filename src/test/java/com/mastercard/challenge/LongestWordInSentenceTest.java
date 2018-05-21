package com.mastercard.challenge;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestWordInSentenceTest {

	static LongestWordInSentence longestWordInSentence = new LongestWordInSentence();

	@Test(dataProvider = "inputSentenceAndLongestWords")
	public void shouldReturnLongestWordInSentence(String inputSentence, List<String> expectedLongestWords) {
		List<String> actualLongestWords = new LinkedList<>();
		actualLongestWords = LongestWordInSentence.findLargestWord(inputSentence);
		assertEquals(expectedLongestWords.size(), actualLongestWords.size(),
				"Number of actual longest words is not equal to the number of expected longest words");
		assertTrue(expectedLongestWords.containsAll(actualLongestWords),
				"Actual longest words are different than expected longest words");
		if (expectedLongestWords.size() > 1) {
			assertEquals(expectedLongestWords.get(0).length(), actualLongestWords.get(0).length(),
					"Length of the actual longest word is not equal to the length of expected longest word");
		}
	}

	@DataProvider(name = "inputSentenceAndLongestWords")
	public Object[][] createTestData() {
		return new Object[][] {
				{ "The climate in washington is great", new LinkedList<String>(Arrays.asList("washington")) },
				{ "", new LinkedList<String>() },
				{ "This is test for list", new LinkedList<String>(Arrays.asList("This", "test", "list")) },
				{ "Cool", new LinkedList<String>(Arrays.asList("Cool")) },
				{ "Mind long past care goes free fall", new LinkedList<String>(
						Arrays.asList("Mind", "long", "past", "care", "goes", "free", "fall")) } };
	}
}
