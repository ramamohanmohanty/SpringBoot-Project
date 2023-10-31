package org.jt.frontenddatapassform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {
    @GetMapping
    public String home() {
        return "home";
    }

    @PostMapping("/submit")
    // public void greet(@RequestParam String name,@RequestParam int roll
    // ,PrintWriter pw){
    // pw.println("Welcome "+ name);
    // pw.println("Welcome "+ roll);
    // }
    // public void greet(HttpServletRequest request,PrintWriter pw){
    // String name = request.getParameter("name");
    // pw.println("Welcome" +name);
    // }

    // The @ModelAttribute annotation binds form data to the 'student' object.
    public String greet(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "about";
    }
}
