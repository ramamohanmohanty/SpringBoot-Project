package org.jt.lifecycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifeCycleApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		System.out.println("Main Started");
		var beans = SpringApplication.run(LifeCycleApplication.class, args);
		beans.getBean(Hello.class).sayHello();
		System.out.println("Main Method End then next destroy method call");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command Line Runner Called");
	}
}
