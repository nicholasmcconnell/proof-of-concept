package com.nickdemos.spring_boot.controllers;

import com.nickdemos.spring_boot.repos.UserRepository;
import com.nickdemos.spring_boot.dtos.Credentials;
import com.nickdemos.spring_boot.models.AppUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.springframework.http.MediaType.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    private UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    @GetMapping("/test")
    public String test() {
        logger.info("/user/test");
        return "/users/test works!";
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<AppUser> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public AppUser registerNewUser(@RequestBody @Valid AppUser newUser) {
        return userRepo.save(newUser);
    }

    @PostMapping(value = "/auth", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public AppUser authenticate(@RequestBody @Valid Credentials creds){
        return userRepo.findAppUserByUsernameAndPassword(creds.getUsername(), creds.getPassword());
    }
}
