package com.rulesback.rulesback.service.implementation;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import com.rulesback.rulesback.service.implementation.TableServiceImp;


public class TableServiceImpTest {

    @Test
    void testGetTuples() {
        TableServiceImp tableServiceImp = Mockito.mock(TableServiceImp.class);
        tableServiceImp.getTuples();
        Mockito.verify(tableServiceImp).getTuples();
    }

    @Test
    void testGetTuplesDataType() {
        TableServiceImp tableServiceImp = Mockito.mock(TableServiceImp.class);
        tableServiceImp.getTuplesDataType();
        Mockito.verify(tableServiceImp).getTuplesDataType();
    }

    @Test
    void testGetObjects() {
        TableServiceImp tableServiceImp = Mockito.mock(TableServiceImp.class);
        tableServiceImp.getObjects();
        Mockito.verify(tableServiceImp).getObjects();
    }
}
