package com.nico.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
public class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int alter;


    public List<Car> getAutos() {
        return autos;
    }

    public void setAutos(List<Car> autos) {
        this.autos = autos;
    }

    @OneToMany(
            mappedBy = "nutzer",
            cascade = CascadeType.ALL,
            orphanRemoval =  true
    )
    private List<Car> autos = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public User()
    {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
