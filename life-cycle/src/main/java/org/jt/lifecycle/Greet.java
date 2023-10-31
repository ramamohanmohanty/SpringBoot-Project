package org.jt.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greet {
    private Greeting greeting;

    public Greet() {
        System.out.println("Greet Constructed");
    }

    @Autowired
    public void setGreeting(Greeting greeting) {
        System.out.println("Dependancy Injected");
        this.greeting = greeting;
    }
}
