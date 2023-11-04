package org.jt.onetomanyrelation.repository;

import org.jt.onetomanyrelation.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
    
}
