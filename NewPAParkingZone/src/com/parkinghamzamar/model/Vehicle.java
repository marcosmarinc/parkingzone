package com.parkinghamzamar.model;

/**
 *
 * @author ismael
 */
public class Vehicle {

    private String plate;
    private String brand;
    private String carOwner;
    private String kindVehicle;
    private String fechaSalida;
    private String fechaEntrada;
    private double tarifa;

    public Vehicle(String plate, String brand, String carOwner, String kindVehicle, String fechaSalida, String fechaEntrada, double tarifa) {
        this.plate = plate;
        this.brand = brand;
        this.carOwner = carOwner;
        this.kindVehicle = kindVehicle;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
        this.tarifa = tarifa;
    }

    public Vehicle(String plate, String brand, String carOwner, String kindVehicle) {
        this.plate = plate;
        this.brand = brand;
        this.carOwner = carOwner;
        this.kindVehicle = kindVehicle;
    }

    public Vehicle() {
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getKindVehicle() {
        return kindVehicle;
    }

    public void setKindVehicle(String kindVehicle) {
        this.kindVehicle = kindVehicle;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{");
        sb.append("plate=").append(plate);
        sb.append(", brand=").append(brand);
        sb.append(", carOwner=").append(carOwner);
        sb.append(", kindVehicle=").append(kindVehicle);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", tarifa=").append(tarifa);
        sb.append('}');
        return sb.toString();
    }

}
