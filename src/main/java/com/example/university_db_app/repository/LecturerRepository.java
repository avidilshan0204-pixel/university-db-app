package com.example.university_db_app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university_db_app.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
 Optional<Lecturer> findByEmail(String email);
 // property path: Lecturer.department.code (underscore = go into the related object)
 List<Lecturer> findByDepartment_Code(String departmentCode);
}
