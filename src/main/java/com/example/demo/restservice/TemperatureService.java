package com.example.demo.restservice;

import java.util.List;

public interface TemperatureService {
    List<Temperature> temperatures();
    List<Temperature> setTemperate(Temperature newTemperature);
}
