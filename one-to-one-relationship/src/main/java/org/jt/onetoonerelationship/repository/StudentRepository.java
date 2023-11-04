package org.jt.onetoonerelationship.repository;

import org.jt.onetoonerelationship.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
