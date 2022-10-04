package com.saraya.newestDemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.rmi.StubNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student idi = new Student(

                    "Drissa",
                    "sidibedrissab@gmail.com",
                    LocalDate.of(1993, Month.MARCH,01)

            );
            Student moss = new Student(
                    "Mossi",
                    "sidibemossib@gmail.com",
                    LocalDate.of(1989,Month.MARCH,05)

            );
            Student toss = new Student(

                    "Fatou",
                    "sidibefatoumata@gamil.com",
                    LocalDate.of(1988, Month.MARCH ,06)

            );
           repository.saveAll(List.of(idi,moss, toss));
        };
    }
}
