package com.rulesback.rulesback.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;

import com.rulesback.rulesback.api.DBdataAPI;
import com.rulesback.rulesback.dto.TupleDTO;
import com.rulesback.rulesback.mapper.TupleMapper;
import com.rulesback.rulesback.service.TableService;


import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TableController implements DBdataAPI{
    
    private TupleMapper tupleMapper;
    private TableService tableService;

    @Override
    public List<TupleDTO> getDBdata() {
        return tableService.getTuples().stream()
                .map(tupleMapper::fromTuple)
                .collect(Collectors.toList());
    }


}
