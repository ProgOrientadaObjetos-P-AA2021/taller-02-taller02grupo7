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
public class PasajeMenorEdad extends PasajeInterCantonal
        implements Serializable {

    private double descuento;

    public PasajeMenorEdad(String nom, String ce, String or, String de,
            double num, double ta, double d) {
        super(nom, ce, or, de, num, ta);

        descuento = d;

    }

    public void establecerAdicional(double x) {
        descuento = x;
    }
    
    @Override
    public void setPasajeInterCantonal() {

        valorPasaje = (numeroKilometros * 0.10)
                + (tarifaBase + (tarifaBase * (descuento / 100)));
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Porcentaje Adicional:% .2f\n"
                + "Descuento: %.2f\n",
                 super.toString(),
                obtenerDescuento(), getPasajeIntercantonal());

        return cadena;
    }

}
