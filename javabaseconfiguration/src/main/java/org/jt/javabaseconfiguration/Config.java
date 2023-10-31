package org.jt.javabaseconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean
    @Scope("prototype")
  public Hello hello(){//public is not recommended but if we write public use no problem
		return new Hello();
	}
}
