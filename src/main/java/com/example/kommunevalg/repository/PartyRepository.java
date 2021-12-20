package com.example.kommunevalg.repository;

import com.example.kommunevalg.entity.Party;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Configuration

public interface PartyRepository extends CrudRepository<Party, Integer> {



}