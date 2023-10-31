package org.jt.commandlinerunnerbean;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CommandLinerrunnerBeanApplication {
	public static void main(String[] args) {
		SpringApplication.run(CommandLinerrunnerBeanApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("Hello World!");
		};
	}
}