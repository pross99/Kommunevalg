package com.example.kommunevalg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Party {

    String party;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public Party(String party) {
        this.party = party;
    }



public Party(){}
}
