package com.rulesback.rulesback.api;

import com.rulesback.rulesback.dto.TupleDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface DBdataAPI {
    
    @GetMapping("/dbdata")
    List<TupleDTO> getDBdata();

    @GetMapping("/")
    String getHello();

    @GetMapping("/types")
    String getTypes();
}
