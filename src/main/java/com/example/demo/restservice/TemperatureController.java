package com.example.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class TemperatureController {

    private TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("/temperature")
    public List<Temperature> temperature() {
        return temperatureService.temperatures();
    }


    @PutMapping("/temperature")
    public List<Temperature> setTemperate(@RequestBody @Valid Temperature newTemperature) { // Add annotation to validaete
        return temperatureService.setTemperate(newTemperature);
    }
}
