package com.parkinghamzamar.model;

/**
 *
 * @author ismael
 */
public class Cubicle {
    
    private int id;
    private int numero;
    private String vehiculo;
    private boolean ocupado;

    public Cubicle(int id, int numero, String vehicle ,boolean ocupado) {
        this.id = id;
        this.numero = numero;
        this.vehiculo = vehicle;
        this.ocupado = ocupado;
    }

    public Cubicle() {
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Cubicle{" + "id=" + id + ", numero=" + numero + ", ocupado=" + ocupado + '}';
    }
    
}
