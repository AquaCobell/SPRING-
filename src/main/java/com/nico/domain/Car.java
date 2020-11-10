package com.nico.domain;


import javax.persistence.*;

@Entity
//@Table(name = "Car")
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String modell;
    private String marke;
    private String nummerntafel;

    public Car(String marke, User nutzer) {
        this.marke = marke;
        this.nutzer = nutzer;
    }

    @ManyToOne
    @JoinColumn(name = "auto_id")
    private User nutzer;



    public Car()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getNummerntafel() {
        return nummerntafel;
    }

    public void setNummerntafel(String nummerntafel) {
        this.nummerntafel = nummerntafel;
    }
}

