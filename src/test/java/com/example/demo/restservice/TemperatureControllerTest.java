package com.example.demo.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TemperatureControllerTest {

    TemperatureService service;

    TemperatureController controller;

    @BeforeEach
    public void setUp() {
        this.service = Mockito.mock(InMemoryTempService.class);

        this.controller = new TemperatureController(this.service);
    }

    // arrange act assert
    @Test
    void getTemperatures() {
        //arrange
        Temperature temp = new Temperature(10);
        List<Temperature> temperatures = List.of(temp);
        when(this.service.temperatures()).thenReturn(temperatures);

        //act
        List<Temperature> actualTemps = controller.temperature();

        assertEquals(1, actualTemps.size());
        //assert
        assertEquals(10, actualTemps.get(0).getTemperature());
    }

    @Test
    void setNewTemperature() {
        //arrange
        Temperature temp1 = new Temperature(10);
        Temperature temp2 = new Temperature(20);

        List<Temperature> temperatures = List.of(temp1, temp2);
        when(this.service.setTemperate(temp2)).thenReturn(temperatures);

        //act
        List<Temperature> actualTemps = this.controller.setTemperate(temp2);

        assertEquals(temperatures, actualTemps);
    }
}
