package com.example.demo.restservice;

import com.example.demo.restservice.repositories.TemperatureEntity;
import com.example.demo.restservice.repositories.TemperatureRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryDBService implements TemperatureService {

    private TemperatureRepository repository;

    public InMemoryDBService(TemperatureRepository repository) {
        this.repository = repository;
    }

    // List<TemperatureEntities> -> List<Temperatures
    @Override
    public List<Temperature> temperatures() {
        List<Temperature> response = new ArrayList<>();
        repository.findAll().forEach(entity -> response.add(new Temperature(entity.getTemperature())));

        return response;
    }

    @Override
    public List<Temperature> setTemperate(Temperature newTemperature) {
        repository.save(new TemperatureEntity(newTemperature.getTemperature()));
        return temperatures();
    }
}
