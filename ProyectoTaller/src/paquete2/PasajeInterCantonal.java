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

    }

    public abstract void PasajeInterCantonal();

    @Override
    public String toString() {
        return String.format("Pasaje.");
    }

}
