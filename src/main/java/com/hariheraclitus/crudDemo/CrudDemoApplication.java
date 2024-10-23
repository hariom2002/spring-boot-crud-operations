package com.hariheraclitus.crudDemo;

import com.hariheraclitus.crudDemo.rest.Student;
import com.hariheraclitus.crudDemo.rest.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
	// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
	// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
	// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

	private void readStudent(StudentDAO studentDAO) {
		// finding the student object
		System.out.println("finding the student...");
		Student theStudent  = studentDAO.findId(1);
		// display id of the saved student
		System.out.println("Student found with  id: " + theStudent.getId());
		System.out.println(theStudent.toString());


	}
}
