package org.hackerandpainter.springbootgraphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.hackerandpainter.springbootgraphql.entity.Vehicle;
import org.hackerandpainter.springbootgraphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    /**
     * 获得车辆
     * @param count
     * @return
     */
    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    /**
     * 获得车辆
     * @param id
     * @return
     */
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
