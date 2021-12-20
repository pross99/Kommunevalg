package com.example.kommunevalg.rest;

import com.example.kommunevalg.entity.Candidate;
import com.example.kommunevalg.entity.Party;
import com.example.kommunevalg.errors.NotFoundException;
import com.example.kommunevalg.repository.PartyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/parties")
public class PartyController {

    PartyRepository partyRepository;


    public PartyController(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    @GetMapping
    Iterable<Party> getAll() {return partyRepository.findAll();}





}
