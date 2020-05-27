package com.example.aopdome.Controller;

import com.example.aopdome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qupengfei
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(Integer id){
return userService.getUserById(id);
    }
}
