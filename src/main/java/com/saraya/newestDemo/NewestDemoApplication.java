package com.saraya.newestDemo;

import com.saraya.newestDemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication


public class NewestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewestDemoApplication.class, args);
	}
//	@GetMapping("/student")
//	public List<Student> hello(){
////		return List.of(new Student(
////				1l,
////				"Drissa",
////				"sidibedrissabe@gmail.om",
////				LocalDate.of(1993, 03,01),
////				29
////
////		));
}

