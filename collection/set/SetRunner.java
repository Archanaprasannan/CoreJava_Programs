package com.archa.workspace.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> character = List.of('A', 'Z', 'C', 'A', 'V', 'Z');

		Set<Character> setcharacter = new TreeSet<>(character);
		System.out.println(setcharacter);

		Set<Character> linkedcharacter = new LinkedHashSet<>(character);
		System.out.println(linkedcharacter);

		Set<Character> hashedcharacter = new HashSet<>(character);
		System.out.println(hashedcharacter);
	}

}
