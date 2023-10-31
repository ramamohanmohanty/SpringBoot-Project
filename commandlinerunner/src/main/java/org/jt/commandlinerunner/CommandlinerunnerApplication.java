package org.jt.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandlinerunnerApplication implements CommandLineRunner{
	@Autowired
	private hello hello;
	public static void main(String[] args) {
		SpringApplication.run(CommandlinerunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		hello.sayHello();
	}

}
