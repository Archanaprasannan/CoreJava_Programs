package com.archa.workspace.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}
public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> list = List.of(new Student(100, "Adam"), new Student(20, "Archa"), new Student(300, "eve"));

		List<Student> listAl = new ArrayList<>(list);
		System.out.println(list);
		// Collections.sort(listAl);
		// System.out.println(listAl);
		// method1
		Collections.sort(listAl, new StudentComparator());
		System.out.println(listAl);
		//method2
		listAl.sort(new StudentComparator());
		System.out.println(listAl);
	}

}
