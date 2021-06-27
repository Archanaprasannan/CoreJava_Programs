package com.archa.workspace.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path fileToRead = Paths.get("./resources/write.txt");
		List<String> list = List.of("Apple", "carrot", "dog", "cat");
		Files.write(fileToRead, list);

	}

}
