package com.example.kommunevalg.entity;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(precision=10, scale=2)
    String party;
    String votes;


    public Result(String party, String votes) {
        this.party = party;
        this.votes = votes;
    }

    public Result () {}



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

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }
}
