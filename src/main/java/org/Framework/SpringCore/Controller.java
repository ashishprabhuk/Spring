package org.Framework.SpringCore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

record details(String name, int age, String job) {};

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hi Ashish";
    }

    @GetMapping("/data")
    public details getData() {
        var data = new details("Ashish", 21, "dev");
        return data;
    }
}