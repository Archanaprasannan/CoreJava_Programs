package com.archa.workspace.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an Awesome book.Never Read Before";
		Map<Character, Integer> occurences = new HashMap<>();
		char[] character = str.toCharArray();
		for (char characters : character) {
			Integer integer = occurences.get(characters);
			if (integer == null) {
				occurences.put(characters, 1);
			} else

			{
				occurences.put(characters, integer + 1);
			}
		}

		System.out.println(occurences);

		// for String

		Map<String, Integer> stringoccurences = new HashMap<>();
		String[] words = str.split(" ");

		for (String word : words) {
			Integer integer = stringoccurences.get(word);
			if (integer == null) {
				stringoccurences.put(word, 1);
			} else

			{
				stringoccurences.put(word, integer + 1);
			}
		}

		System.out.println(stringoccurences);

	}

}
