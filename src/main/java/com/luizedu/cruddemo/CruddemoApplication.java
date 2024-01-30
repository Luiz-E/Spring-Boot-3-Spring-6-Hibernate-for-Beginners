package com.luizedu.cruddemo;

import com.luizedu.cruddemo.dao.StudentDAO;
import com.luizedu.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//readStudent(studentDAO);
			getAllStudents(studentDAO);
		};
	}

	private void getAllStudents(StudentDAO studentDAO) {
		for (int i = 0; i < 8/*number of students*/; i++) {
			System.out.println(studentDAO.findById(i));
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student");
		Student student = new Student("Daffy", "Duck", "daffy@luv2code.com");
		System.out.println("Saving student");
		studentDAO.save(student);
		Integer id = student.getId();
		System.out.println("Student saved. Id:" + id);
		System.out.println("Retrieving student.");
		Student myStudent = studentDAO.findById(id);
		System.out.println(myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 3 students...");
		Student student1 = new Student("John", "Doe", "john@luv2code.com");
		Student student2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student student3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
		System.out.println("Saving students...");
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);

		System.out.println("Saved first student. Generated id:"  + student1.getId());
		System.out.println("Saved second student. Generated id:"  + student2.getId());
		System.out.println("Saved third student. Generated id:"  + student3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student...");
		Student student = new Student("Paul", "Doe", "paul@luv2code.com");
		System.out.println("Saving student...");
		studentDAO.save(student);

		System.out.println("Saved student. Generated id:"  + student.getId());
	}
}
