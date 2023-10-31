package org.jt.yamlfileconcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YamlFileConceptApplication {
	@Value("${employee.name}")
	private String employeeName;
	@Value("${employee.salary}")
	private double employeeSalary;
	@Value("${employee.address.city}")
	private String employeeCity;
	@Value("${employee.address.state}")
	private String employeeState;

	public static void main(String[] args) {
		SpringApplication.run(YamlFileConceptApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println(employeeName + " " + employeeSalary + " " + employeeCity + " " + employeeState);
		};
	}
}
