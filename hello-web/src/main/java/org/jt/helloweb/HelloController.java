package org.jt.helloweb;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
    @RequestMapping({"/home","/"})
    public void home(PrintWriter pr){
        var html = """
                <html>
                    <head>
                        <title>Hello Page</title>
                    <head>
                <body>
                    <h2>My Notes </h2>
                    <p>This is my first note.</p>
                </body>
                </html>
            """;

        pr.println("My Spring Boot World");
    }

   //@RequestMapping("/about")
   //public void home1(PrintWriter pr){
   //    pr.println("Hy Spring World");
   //}
}