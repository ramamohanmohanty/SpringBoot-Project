package org.jt.lifecycle;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Greeting {
     Greeting() {
        System.out.println("Greeting Constructer");
    }

    @PostConstruct
    public  void init(){
        System.out.println("Init called for greeting class");
    }
}
