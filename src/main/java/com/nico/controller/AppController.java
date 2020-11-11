package com.nico.controller;

import com.nico.domain.User;
import com.nico.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("users")
@RestController
public class AppController
{
    private final Userservice user1;

    @Autowired
    public AppController(Userservice user)
    {
        this.user1= user;
    }

    @RequestMapping
    public List<User> getallUser() //@RequestBody User user
    {

        return user1.listAll();

    }


    //@RequestMapping("/edit/{id}")
    //public ModelAndView showEditProductPage(@PathVariable(name = "id") int id)
    @RequestMapping("/{id}")
    public User getspecificUser(@PathVariable(name = "id") User test)
    {
        return test;
    }

    @DeleteMapping("delete/{id}")
            public ResponseEntity<String> deleteUser(@PathVariable(name = "id")User test)
    {
        user1.delUser(test);
        return new ResponseEntity<>("Hallo", HttpStatus.OK);
    }


}
