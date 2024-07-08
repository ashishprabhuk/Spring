package org.Framework.SpringBoot.Basics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/users")
    public List<User> retrieveAllUsers(){
        return Arrays.asList(
                new User(1, "Ashish", 21, "Male"),
                new User(2, "Yazhini", 15, "Female")
        );
    }
}