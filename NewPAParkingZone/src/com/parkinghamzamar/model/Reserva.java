package com.parkinghamzamar.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ismael
 */
public class Reserva {

    private int id;
    private Vehicle idVehiculo;
    private Cubicle idCubiculo;
    private String fechaReserva;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(int id, Vehicle idVehiculo, Cubicle idCubiculo, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.idVehiculo = idVehiculo;
        this.idCubiculo = idCubiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Reserva() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Vehicle idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Cubicle getIdCubiculo() {
        return idCubiculo;
    }

    public void setIdCubiculo(Cubicle idCubiculo) {
        this.idCubiculo = idCubiculo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public static String fechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date n = new Date();
        return sdf.format(n);
    }

    public static Date stringToDate(String string) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date toDate = null;

        try {
            toDate = sdf.parse(string);
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
        return toDate;
    }

    public static void main(String[] args) {
        String fecha = Reserva.fechaActual();
        Date stringToDate = Reserva.stringToDate(fecha);
        System.out.println(stringToDate);
    }
}
