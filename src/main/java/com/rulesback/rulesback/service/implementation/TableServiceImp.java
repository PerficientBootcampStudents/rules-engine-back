package com.rulesback.rulesback.service.implementation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    public Map<String,List<Map<String,String>>> getObjects(){
        
        Map<String,List<Map<String,String>>> table = new java.util.LinkedHashMap<>();

        //table.put("Columns", getBackDataTypes());
        table.put("tuples", getBackTuples());
        
        return table;
    } 


    public List<Map<String,String>> getBackDataTypes(){
        Map<String, String> map = new java.util.LinkedHashMap<>();
        List<String> types = tupleRepository.getDataTypes();
        List<Map<String,String>> table = new java.util.ArrayList<>();

        for(String dtype : types){
            String[] datatypes = dtype.split(",");
            map.put(datatypes[0], datatypes[1]);
        }
        table.add(map);
        return table;
    }


    public List<Map<String,String>> getBackTuples(){
        Map<String, String> map = new java.util.LinkedHashMap<>();
        List<String> types = tupleRepository.getDataTypes();
        List<Map<String,String>> table = new java.util.ArrayList<>();

        for (String data : tupleRepository.findData()) {
            String[] info = data.split(",");
            for(int i = 0; i < info.length; i++){
                map.put(types.get(i).split(",")[0], info[i]);
            }
            table.add(map);
            map = new java.util.LinkedHashMap<>();
        }
        return table;
    }

    @Override
    public List<String> getTuplesDataType(){
        return tupleRepository.getDataTypes();
    }

    @Override
    public List<Tuple> getTuples() {
        return StreamSupport.stream(tupleRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
    
    
}
