package org.jt.onetomanyrelation;

import java.util.List;

import org.jt.onetomanyrelation.model.Course;
import org.jt.onetomanyrelation.model.Teacher;
import org.jt.onetomanyrelation.repository.CourseRepository;
import org.jt.onetomanyrelation.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class OneToManyRelationApplication implements CommandLineRunner{
	private final TeacherRepository teacherRepository;
	private final CourseRepository courseRepository;
	public static void main(String[] args) {
		SpringApplication.run(OneToManyRelationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		insert();
	}

	private void insert(){
		var course1 = Course.builder().courseName("c").build();
		var course2 = Course.builder().courseName("c++").build();
		var course3 = Course.builder().courseName("java").build();
		var course4 = Course.builder().courseName("php").build();
		var course5 = Course.builder().courseName("javascript").build();
		var course6 = Course.builder().courseName(".net").build();

		var teacher1 = Teacher.builder().teacherName("rashmi").teacherEmail("r@gmail.com").build();
		var teacher2 = Teacher.builder().teacherName("smruti").teacherEmail("s@gmail.com").build();
		var teacher3 = Teacher.builder().teacherName("subham").teacherEmail("s@gmail.com").build();

		teacher1.setCourses(List.of(course1, course2));
		teacher2.setCourses(List.of(course3, course4));
		teacher3.setCourses(List.of(course5, course6));

		teacherRepository.saveAll(List.of(teacher1,teacher2,teacher3));
	}

}
