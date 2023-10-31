package org.jt.externalfileconcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExternalFileConceptApplication {
	@Value("${dburl}")
	private String dburl;

	public static void main(String[] args) {
		SpringApplication.run(ExternalFileConceptApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println(dburl);
		};
	}

}
