package com.rulesback.rulesback.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rulesback.rulesback.model.Tuple;


public interface TupleRepository extends CrudRepository<Tuple, UUID> {

    
    @Query(value = "Select * from bdata", nativeQuery = true)
    List<String> findData();
}
