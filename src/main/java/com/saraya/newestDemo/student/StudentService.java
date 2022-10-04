package com.saraya.newestDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired//Dependency injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
            return studentRepository.findAll();
        }

        @PostMapping
    public void saveNewStudent(Student student) {
           Optional<Student> studentOptionalByEmail = studentRepository.findByEmail(student.getEmail());


           if (studentOptionalByEmail.isPresent()){
               throw new IllegalStateException("Missing Email");
           }
            studentRepository.save(student);
        //System.out.println(student);
    }
}
