package org.jt.backenddatashare;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping()//This line is an annotation for the getEmployees method, indicating that this method should be invoked when an HTTP GET request is made to a specific URL.
    //@GetMapping is a way to map a specific URL to a method in a Spring controller
    public String getEmployees(Model model) { // model will be used to share data from the backend to the frontend.
        var employee1 = new Employee("Ramamohan", "Mohanty", "r@gmail.com");
        var employee2 = new Employee("Ankit", "Mohanty", "a@gmail.com");
        var employee3 = new Employee("Himansu", "Samal", "h@gmail.com");

        var employees = List.of(employee1, employee2, employee3);
        model.addAttribute("employees", employees);//This line adds the employees list to the Model object with the name "employees.

        return "home";
    }
}
