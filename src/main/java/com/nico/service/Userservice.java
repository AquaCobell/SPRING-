package com.nico.service;

import com.nico.domain.Car;
import com.nico.domain.User;
import com.nico.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Userservice
{
    @Autowired
    private UserRepo repo;

    Userservice()
    {

    }
    public List<User> listAll()
    {
        return repo.findAll();
    }
    public void delUser(User user)
    {
        repo.delete(user);
    }

    public User addUser(User user)
    {
        User mensch = new User();
        mensch.setName(user.getName());
        mensch.setAutos(user.getAutos());
        mensch.setAlter(user.getAlter());
        return mensch;
    }
}
