package com.rulesback.rulesback.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rulesback.rulesback.model.Tuple;
import com.rulesback.rulesback.repository.TupleRepository;
import com.rulesback.rulesback.service.TableService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TableServiceImp implements TableService{
    private TupleRepository tupleRepository;

    @Override
    public List<Tuple> getTuples() {
        return StreamSupport.stream(tupleRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
    
    
}
