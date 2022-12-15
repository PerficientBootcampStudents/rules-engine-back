package com.rulesback.rulesback.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class TableControllerTest {
    
    @Test
    void testGetDBdata() {
        TableController tableController = Mockito.mock(TableController.class);
        tableController.getDBdata();
        Mockito.verify(tableController).getDBdata();
    }
    
    @Test
    void testGetObjects() {
        TableController tableController = Mockito.mock(TableController.class);
        tableController.getObjects();
        Mockito.verify(tableController).getObjects();
    }
    
    @Test
    void testGetHello() {
        TableController tableController = Mockito.mock(TableController.class);
        tableController.getHello();
        Mockito.verify(tableController).getHello();
    }
    
    @Test
    void testGetTypes() {
        TableController tableController = Mockito.mock(TableController.class);
        tableController.getTypes();
        Mockito.verify(tableController).getTypes();
    }
    
    @Test
    void testString() {
        TableController tableController = Mockito.mock(TableController.class);
        tableController.string("string");
        Mockito.verify(tableController).string("string");
    }
}
