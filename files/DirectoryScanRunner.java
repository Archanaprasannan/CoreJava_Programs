package com.archa.workspace.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");
		// pass through the folders of current directory
		// Files.list(currentDirectory).forEach(System.out::println);

		// pass through the current directory in deeper level(2-deep level 2)
		// Files.walk(currentDirectory, 2).forEach(System.out::println);

		// filter the files that have java in it using predicate
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
		Files.find(currentDirectory, 5, matcher).forEach(System.out::println);
	}

}
