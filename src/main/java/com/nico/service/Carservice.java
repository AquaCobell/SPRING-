package com.nico.service;

import com.nico.domain.Car;
import com.nico.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Carservice
{
    @Autowired
    private CarRepo repo;

    public List<Car> listAll()
    {
        return repo.findAll();
    }
}
