package com.saraya.newestDemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {

   // @Query("SELECT S FROM Student S WHERE S.email =?1")
    //This method uses the optional to prevent you from having null pointerException.
    Optional<Student> findByEmail(String email);
}
//This is the data access from DB