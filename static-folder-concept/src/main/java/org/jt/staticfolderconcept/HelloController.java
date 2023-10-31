package org.jt.staticfolderconcept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String home(Model model) {
        var student = new Student("Ram",101,20352);
        model.addAttribute("student", student);
        model.addAttribute("name", "Java Technocrat");
        return "index";
    }
}
