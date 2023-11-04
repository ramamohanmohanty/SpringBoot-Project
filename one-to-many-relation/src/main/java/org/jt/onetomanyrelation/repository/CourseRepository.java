package org.jt.onetomanyrelation.repository;

import org.jt.onetomanyrelation.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,String>{
    
}
