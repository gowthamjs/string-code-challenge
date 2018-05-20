package com.mastercard.challenge;

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
		assertTrue(expectedLongestWords.containsAll(actualLongestWords),
				"Actual longest words are different than expected longest words");
	}

	@DataProvider(name = "inputSentenceAndLongestWords")
	public Object[][] createTestData() {
		return new Object[][] { { "This is great", new LinkedList<String>(Arrays.asList("great")) },
				{ "", new LinkedList<String>() },
				{ "This is test for list", new LinkedList<String>(Arrays.asList("This", "test", "list")) },
				{ "Cool", new LinkedList<String>(Arrays.asList("Cool")) } };
	}
}
