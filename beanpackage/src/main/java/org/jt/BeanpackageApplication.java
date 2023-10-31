package org.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@ComponentScans({"org.jt.beanpackage","org.jt"})
public class BeanpackageApplication {

	public static void main(String[] args) {
		var beans = SpringApplication.run(BeanpackageApplication.class, args);
		beans.getBean(ThanksGiving.class).thanks();
	}

}
