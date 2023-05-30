package com.parkinghamzamar.services;

import com.parkinghamzamar.model.Vehicle;
import java.sql.SQLException;
/**
 *
 * @author ismael
 */
public interface VehiclesServices {
    
    boolean insertVehicle(Vehicle ve)throws SQLException;
    Vehicle getVehicleById(String placa)throws SQLException;

}
