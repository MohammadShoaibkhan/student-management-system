package com.techproject.sms;

import com.techproject.sms.entity.Student;
import com.techproject.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

    @Autowired
    private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Shoaib","Khan","shoaib@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Aamir","Khan","aamir@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Asif","Khan","asif@gmail.com");
//		studentRepository.save(student3);

	}
}
