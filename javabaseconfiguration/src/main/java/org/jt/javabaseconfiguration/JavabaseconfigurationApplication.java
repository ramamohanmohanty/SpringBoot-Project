package org.jt.javabaseconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavabaseconfigurationApplication implements CommandLineRunner{
	@Autowired
	private Hello hello1;
	private Hello hello2;

	
	
	public JavabaseconfigurationApplication(Hello hello1, Hello hello2) {
		this.hello1 = hello1;
		this.hello2 = hello2;
	}

	public static void main(String[] args) {
		/*var beans = */SpringApplication.run(JavabaseconfigurationApplication.class, args);
		//beans.getBean(Hello.class).sayHello();

	}

	@Override
	public void run(String... args) throws Exception {
		//hello.sayHello();
		System.out.println(hello1 == hello2);
	}
}
