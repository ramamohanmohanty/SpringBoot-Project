package org.jt.interfacebeanconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterfacebeanconceptApplication implements CommandLineRunner{
	@Autowired
	private Animal animal;
	public static void main(String[] args) {
		SpringApplication.run(InterfacebeanconceptApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		animal.eat();
	}

}
