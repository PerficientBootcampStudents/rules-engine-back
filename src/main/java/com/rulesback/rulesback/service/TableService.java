package com.rulesback.rulesback.service;

import java.util.List;


import com.rulesback.rulesback.model.Tuple;

public interface TableService {
        
        List<String> getObjects();
        List<Tuple> getTuples();
}
