package org.Framework.SpringBoot.Basics.EmployeeMS.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        return "Welcome to Employee API";
    }
}
