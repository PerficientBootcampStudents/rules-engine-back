package com.rulesback.rulesback.api;

import com.rulesback.rulesback.dto.TupleDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface DBdataAPI {
    
    @GetMapping("/dbdata")
    List<TupleDTO> getDBdata();

    @GetMapping("/objects")
    List<String> getObjects();

    @GetMapping("/")
    String getHello();

    @GetMapping("/types")
    List<String> getTypes();

    @PostMapping("/string")
    public String string(@RequestBody String string);
}
