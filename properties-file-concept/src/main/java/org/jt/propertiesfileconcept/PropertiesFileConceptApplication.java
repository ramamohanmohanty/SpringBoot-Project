package org.jt.propertiesfileconcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertiesFileConceptApplication implements CommandLineRunner {
	@Value("${student.name}") // spring el - expresion language
	private String studentname;
	@Value("${employee.name}")
	private String employeename;
	@Value("#{100 + ${roll}}")
	private int roll;

	public static void main(String[] args) {
		SpringApplication.run(PropertiesFileConceptApplication.class, args);

	}

	/*
	 * @Override
	 * public void run(String... args) throws Exception {
	 * System.out.println(studentName+" "+employeeName);
	 * }
	 */

	@Override
	public void run(String... args) throws Exception {
		System.out.println(studentname+" "+employeename+" "+roll);

	}
}

/*
 * @Bean
 * CommandLineRunner commandLineRunner(){
 * return args -> {
 * System.out.println(name);
 * };
 * }
 */ // Anther way to print