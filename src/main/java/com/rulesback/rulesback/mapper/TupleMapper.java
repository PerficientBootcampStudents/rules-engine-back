package com.rulesback.rulesback.mapper;

import com.rulesback.rulesback.dto.TupleDTO;
import com.rulesback.rulesback.model.Tuple;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TupleMapper {
    
    TupleDTO fromTuple(Tuple tuple);

    Tuple fromTupleDTO(TupleDTO tupleDTO);

}
