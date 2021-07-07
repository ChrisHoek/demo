package com.example.demo.restservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Service
public class InMemoryTempService implements TemperatureService {

    List<Temperature> temperatures = new ArrayList<>();


    public List<Temperature> temperatures() {
        return temperatures;
    }



    public List<Temperature> setTemperate(@RequestBody @Valid Temperature newTemperature) { // Add annotation to validaete
        System.out.println(newTemperature);

        temperatures.add(newTemperature);
        return temperatures;
    }
}
