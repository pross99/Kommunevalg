package com.example.kommunevalg.entity;


import javax.persistence.*;


@Entity // Entity repræsenterer data der kan overføres til database.
public class Candidate {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Denne anotation specificere en værdi som bliver automatisk generated
    int id;

    String firstName;
    String lastName;


    @ManyToOne // Mange kandidater kan have et parti!
    @JoinColumn(name = "party_id", referencedColumnName = "id")

    private Party party;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, Party party) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.party=party;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
}