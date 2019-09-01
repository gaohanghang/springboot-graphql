package org.hackerandpainter.springbootgraphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.hackerandpainter.springbootgraphql.entity.Vehicle;
import org.hackerandpainter.springbootgraphql.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    /**
     * 创造车辆
     * @param type
     * @param modelCode
     * @param brandName
     * @param launchDate
     * @return
     */
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
