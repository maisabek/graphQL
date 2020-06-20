package com.graphQL.service;

import com.graphQL.dao.repository;
import com.graphQL.dao.vehicle;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {
    private final repository vehicleRepository ;

    public VehicleService(final repository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }

    @Transactional
    public vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        final vehicle vehicle = new vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }

    @Transactional(readOnly = true)
    public List<vehicle> getAllVehicles(final int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<vehicle> getVehicle(final int id) {
        return this.vehicleRepository.findById(id);
    }
}
