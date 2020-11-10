package com.nico.service;

import com.nico.domain.Car;
import com.nico.domain.User;
import com.nico.repository.UserRepo;

import java.util.List;

public class Userservice
{
    private UserRepo repo;

    public List<User> listAll()
    {
        return repo.findAll();
    }
}
