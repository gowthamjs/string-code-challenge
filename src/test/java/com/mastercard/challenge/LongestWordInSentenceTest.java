package com.mastercard.challenge;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestWordInSentenceTest {

	static LongestWordInSentence longestWordInSentence = new LongestWordInSentence();

	@Test(dataProvider = "inputSentence")
	public void shouldReturnLongestWordInSentence(String inputSentence, List<String> expectedLargestWords) {
		List<String> actualLargestWords = new LinkedList<>();

		actualLargestWords = LongestWordInSentence.findLargestWord(inputSentence);
		System.out.println("Expected word" + expectedLargestWords);
		System.out.println("Actual word" + actualLargestWords);
		assertTrue(expectedLargestWords.containsAll(actualLargestWords),
				"Actual longest words are different then expected longest words");
	}

	@DataProvider(name = "inputSentence")
	public Object[][] createTestData() {
		return new Object[][] { { "This is great", new LinkedList<String>(Arrays.asList("great")) },
				{ "", new LinkedList<String>() },
				{ "This is test for list", new LinkedList<String>(Arrays.asList("This", "test", "list")) },
				{ "Cool", new LinkedList<String>(Arrays.asList("Cool")) } };
	}
}
