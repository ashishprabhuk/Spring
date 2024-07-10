package org.Framework.SpringBoot.SimpleApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        return "Welcome to Employee API";
    }
}
