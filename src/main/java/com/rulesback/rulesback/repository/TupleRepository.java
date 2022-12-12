package com.rulesback.rulesback.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rulesback.rulesback.model.Tuple;


public interface TupleRepository extends CrudRepository<Tuple, UUID> {

    @Query(value = "SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'bdata'", nativeQuery = true)
    List<String> getDataTypes();
    
    @Query(value = "Select * from bdata", nativeQuery = true)
    List<String> findData();
}
