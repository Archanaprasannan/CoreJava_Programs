package com.archa.workspace.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setCollege("SAINTGITS");
		 * student.setYear(12); System.out.println(student);
		 * 
		 * Person person=new Person(); person.setName("Archa");
		 * person.setEmail("archa@128minutes.com"); person.setPhnNum("123-456-7890");
		 * System.out.println(person);
		 */

		Employee employee = new Employee("Archa", "Software Developer");
		// employee.setName("Archa");
		employee.setEmail("archa@128minutes.com");
		employee.setPhnNum("123-456-7890");
		employee.setEmployerGrade('c');
		// employee.setTitle("Software Developer");
		System.out.println(employee);

		Student student = new Student("rag", "saintgits");
		student.setEmail("rag@gmail.com");
		System.out.println(student);

	}

}
