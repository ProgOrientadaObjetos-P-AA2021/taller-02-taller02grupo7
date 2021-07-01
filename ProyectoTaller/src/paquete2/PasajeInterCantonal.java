/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public abstract class PasajeInterCantonal implements Serializable {

    protected String nombreCliente;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected double numeroKilometros;
    protected double tarifaBase;
    protected double valorPasaje;


    public PasajeInterCantonal(String nom, String ced, String orig, String dest,
            double numKil, double tarifa, double pasaje) {
        nombreCliente = nom;
        cedula = ced;
        origen = orig;
        destino = dest;
        numeroKilometros = numKil;
        tarifaBase = tarifa;

    }

    public void setNombreCliente(String n) {
        nombreCliente = n;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setCed(String n) {
        cedula = n;
    }

    public String getCed() {
        return cedula;
    }

    public void setOrigen(String n) {
        origen = n;
    }

    public String getOrigen() {
        return origen;
    }

    public void setDestino(String n) {
        destino = n;
    }

    public String getDestino() {
        return destino;
    }

    public void setNumeroKilometros(double n) {
        numeroKilometros = n;
    }

    public double getNumeroKilometros() {
        return numeroKilometros;
    }

    public void setValorTarifaBase(double n) {
        tarifaBase = n;
    }

    public double getValorTarifaBase() {
        return tarifaBase;
    }

    public abstract void setPasajeInterCantonal();

    public double getPasajeIntercantonal() {
        return valorPasaje;
    }

    @Override
    public String toString() {
        return String.format("El pasajero: %s%tCi:%s\nOrigen: %s\nDestino: %s\n"
                + "Numero de kilometros recorridos: %s\nValor tarifa base:"
                + "%s\nTotal a pagar: %s", getNombreCliente(), getCed(),
                getOrigen(), getDestino(), getNumeroKilometros(),
                getValorTarifaBase(), getPasajeIntercantonal());
    }

}
