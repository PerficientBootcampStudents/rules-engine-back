package com.rulesback.rulesback.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.rulesback.rulesback.model.Tuple;


public interface TupleRepository extends CrudRepository<Tuple, UUID> {    
}
