package com.example.kommunevalg.rest;


import com.example.kommunevalg.entity.Candidate;
import com.example.kommunevalg.entity.Result;
import com.example.kommunevalg.errors.NotFoundException;
import com.example.kommunevalg.repository.ResultRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/results")
public class ResultController {

    ResultRepository resultRepository;


    public ResultController(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @GetMapping
    Iterable<Result> getAll() {return resultRepository.findAll();}




}
