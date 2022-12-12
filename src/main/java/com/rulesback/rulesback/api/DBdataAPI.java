package com.rulesback.rulesback.api;

import com.rulesback.rulesback.dto.TupleDTO;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

public interface DBdataAPI {
    
    @GetMapping("/dbdata")
    List<TupleDTO> getDBdata();

    @GetMapping("/objects")
    Map<String,List<Map<String,String>>> getObjects();

    @GetMapping("/")
    String getHello();

    @GetMapping("/types")
    String getTypes();
}
