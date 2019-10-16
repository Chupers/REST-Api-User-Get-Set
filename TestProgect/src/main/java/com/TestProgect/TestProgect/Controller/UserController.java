package com.TestProgect.TestProgect.Controller;

import com.TestProgect.TestProgect.Entity.UserClass;
import com.TestProgect.TestProgect.Service.UserService;
import com.TestProgect.TestProgect.Service.UserServiceInc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceInc userServiceInc;
    @GetMapping("/getUser")
    private UserClass getUserByName(@RequestParam(name = "name") String name) {
        return userServiceInc.findByFirstName(name);
    }
    @GetMapping("/getUsers")
    private List<UserClass> getUserByName() {
       return userServiceInc.findAll();
    }
    @PostMapping("/save")
    private UserClass saveUser(@RequestBody UserClass user) {
        return userServiceInc.save(user);
    }
}
