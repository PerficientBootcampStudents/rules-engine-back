package com.rulesback.rulesback.service;

import java.util.List;
import java.util.Map;

import com.rulesback.rulesback.model.Tuple;

public interface TableService {
        
        Map<String,List<Map<String,String>>> getObjects();
        List<Tuple> getTuples();
        List<String> getTuplesDataType();
}
