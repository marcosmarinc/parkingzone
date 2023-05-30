package com.parkinghamzamar.controller;

import com.parkinghamzamar.connection.PAConnection;
import com.parkinghamzamar.model.Moto;
import com.parkinghamzamar.model.Vehicle;
import com.parkinghamzamar.services.VehiclesServices;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ismael
 */
public class VehiclesController implements VehiclesServices {

    private final PAConnection pa = new PAConnection();
    private final Connection connection = pa.getConnection();
    private String sql = "";

    @Override
    public boolean insertVehicle(Vehicle ve) throws SQLException {
        sql = "insert into vehiculos (placa,marca,propietario,tipoVehiculo) values (?,?,?,?)";
        return Optional.ofNullable(connection.prepareStatement(sql)).map(t -> {
            try {
                t.setString(1, ve.getPlate());
                t.setString(2, ve.getBrand());
                t.setString(3, ve.getCarOwner());
                t.setString(4, ve.getKindVehicle());
                t.execute();
                return true;
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }).orElse(null);
    }

    @Override
    public Vehicle getVehicleById(String placa) throws SQLException {
        sql = "select * from vehiculos where placa = '" + placa + "'";
        return Optional.ofNullable(connection.prepareStatement(sql))
                .map(t -> {
                    Vehicle veh = null;
                    try (java.sql.ResultSet rs = t.executeQuery()) {
                        while (rs.next()) {
                            veh = new Vehicle(rs.getString("placa"), rs.getString("marca"), rs.getString("propietario"), rs.getString("tipoVehiculo"), placa, rs.getString("horaEntrada"), rs.getDouble("tarifa"));
                        }
                    } catch (SQLException e) {
                    }
                    return veh;
                }).orElse(null);
    }

    public List<Vehicle> getAllMotos() throws SQLException {
        sql = "select * from vehiculos where tipoVehiculo = 'Motocicleta' and estado = true";
        return Optional.ofNullable(connection.prepareStatement(sql))
                .map(t -> {
                    List<Vehicle>getMotos = new ArrayList<>();
                    try (java.sql.ResultSet rs = t.executeQuery()){
                        while(rs.next()){
                            getMotos.add(new Vehicle());
                        }
                        return getMotos;
                    } catch (SQLException e) {
                        System.out.println(e.toString());
                        return null;
                    }
                }).orElse(null);
    }

    public boolean existVehicle(String placa) throws SQLException {
        sql = "select * from vehiculos where placa = '" + placa + "' and estado = true";
        return Optional.ofNullable(connection.prepareStatement(sql)).map(t -> {
            boolean result = false;
            try (java.sql.ResultSet rs = t.executeQuery()) {
                if (rs.next()) {
                    result = true;
                }

            } catch (SQLException e) {
                System.out.println(e.toString());
            }
            return result;
        }).orElse(Boolean.FALSE);
    }

    public int cantidadDeVehiculos(String tipoVehiculo) throws SQLException {
        sql = "select count(*) from vehiculos where tipoVehiculo = '" + tipoVehiculo + "'";
        return Optional.ofNullable(connection.prepareStatement(sql))
                .map(t -> {
                    try (java.sql.ResultSet rs = t.executeQuery()) {
                        int cantidadMotos = 0;
                        if (rs.next()) {
                            cantidadMotos = rs.getInt(1);
                        }
                        return cantidadMotos;
                    } catch (SQLException e) {
                        System.out.println(e.toString());
                        return 0;
                    }
                }).orElse(0);
    }

    public boolean validation(String vehiculos) throws SQLException {
        return cantidadDeVehiculos(vehiculos) == 20;
    }

    public void printList(List<Vehicle> vehicles) {
        vehicles.stream().forEach(t -> {
            System.out.println("Placa: " + t.getPlate());
            System.out.println("Marca: " + t.getBrand());
            System.out.println("Propietario: " + t.getCarOwner());
            System.out.println("Tarifa: ");
        });
    }

    public static void main(String[] args) throws SQLException {
        VehiclesController cv = new VehiclesController();
//        System.out.println(cv.validation("Automovil"));
//        System.out.println(cv.cantidadDeVehiculos("Motocicleta"));
        System.out.println(cv.existVehicle("JD-123"));
    }
}
