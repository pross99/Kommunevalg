package com.example.kommunevalg.repository;

import com.example.kommunevalg.entity.Candidate;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
//  table og id
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {


}
