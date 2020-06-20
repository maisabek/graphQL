package com.graphQL.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphQL.dao.vehicle;
import com.graphQL.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public List<vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
