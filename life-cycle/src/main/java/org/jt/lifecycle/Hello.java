package org.jt.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Hello {
    public Hello(){
        System.out.println("Hello Constructer");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init called for greet class");
    }

    @PreDestroy
    public void Destroy(){
        System.out.println("Destroyed Hello Class");
    }

    public void sayHello(){
        System.out.println("Hello Spring");
    }
}
