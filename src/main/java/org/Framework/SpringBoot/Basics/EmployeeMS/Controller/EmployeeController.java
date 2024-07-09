package org.Framework.SpringBoot.Basics.EmployeeMS.Controller;

import org.Framework.SpringBoot.Basics.EmployeeMS.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/employee")
    public List<Employee> retrieveAllEmployees(){
        return Arrays.asList(
                new Employee(1, "Ashish", 21, "apk@gmail.com", "Developer"),
                new Employee(2, "Yazhini", 15, "yazhini@gmail.com", "Student")
        );
    }
}