package org.jt.urldatapassing;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataPassController {
    @GetMapping({"/","hi"})
    public String home(Model model){
        model.addAttribute("id", 101);
        model.addAttribute("name","Ram");
        return "home";
    }

    @GetMapping("/hello")
    public void hello(@RequestParam(required = false, defaultValue = "0") int id,@RequestParam(required = false, defaultValue = "hello") String name, PrintWriter pw){
        pw.println(id);
        pw.println(name);

        //return "redirect : /hi";
    }
}
