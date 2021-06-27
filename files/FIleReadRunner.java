package com.archa.workspace.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleReadRunner {

	public static void main(String[] args) throws IOException {
		//simple read method from a small file
		Path pathfileToRead = (Paths.get("./resources/data.txt"));
		List<String> list = Files.readAllLines(pathfileToRead);
		System.out.println(list);

		// method to read from a large file
		Path pathfileToRead1 = (Paths.get("./resources/data.txt"));
		Files.lines(pathfileToRead1).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println);

	}

}
