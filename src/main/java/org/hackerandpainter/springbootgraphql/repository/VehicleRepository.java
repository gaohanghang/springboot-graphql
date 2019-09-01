package org.hackerandpainter.springbootgraphql.repository;

import org.hackerandpainter.springbootgraphql.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 车辆Repository
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
