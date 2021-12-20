package com.example.kommunevalg.rest;


import com.example.kommunevalg.entity.Candidate;
import com.example.kommunevalg.errors.NotFoundException;
import com.example.kommunevalg.repository.CandidateRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/candidates")
public class CommuneResource {

    CandidateRepository candidateRepository;

    public CommuneResource(CandidateRepository candidateRepository) { this.candidateRepository = candidateRepository; }

    @GetMapping
    Iterable<Candidate> getAll() {return candidateRepository.findAll();}



    @GetMapping("/{id}")
    Candidate getOne(@PathVariable("id") int id) {
        return candidateRepository.findById(id).orElseThrow(() -> new NotFoundException("Politician not found"));
    }


@PostMapping()
Candidate addOne(@RequestBody Candidate candidate) {return candidateRepository.save(candidate);}

    @PutMapping("/{id}")
    Candidate editOne(@RequestBody Candidate candidate, @PathVariable("id")int id) {
        Candidate g = candidateRepository.findById(id).get();
        g.setFirstName(candidate.getFirstName());
        g.setLastName(candidate.getLastName());
        g.setParty(candidate.getParty());
        return candidateRepository.save(g);
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable("id")int id) {
        candidateRepository.deleteById(id);}



}
