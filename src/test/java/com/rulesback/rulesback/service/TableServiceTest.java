package com.rulesback.rulesback.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.rulesback.rulesback.service.TableService;


public class TableServiceTest {
    
    @Test
    void testGetTuples() {
        TableService tableService = Mockito.mock(TableService.class);
        tableService.getTuples();
        Mockito.verify(tableService).getTuples();
    }
    
    @Test
    void testGetTuplesDataType() {
        TableService tableService = Mockito.mock(TableService.class);
        tableService.getTuplesDataType();
        Mockito.verify(tableService).getTuplesDataType();
    }
    
    @Test
    void testGetObjects() {
        TableService tableService = Mockito.mock(TableService.class);
        tableService.getObjects();
        Mockito.verify(tableService).getObjects();
    }
}
