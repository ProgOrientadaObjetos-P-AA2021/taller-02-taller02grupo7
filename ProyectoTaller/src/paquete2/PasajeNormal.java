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
public class PasajeNormal extends PasajeInterCantonal
        implements Serializable {

    private double adicional;

    public PasajeNormal(String nom, String ce, String or, String de,
            double num, double ta, double pa, double adi) {
        super(nom, ce, or, de, num, ta, pa);

        adicional = adi;

    }

    public void establecerAdicional(double x) {
        adicional = x;
    }

    @Override
    public void setValorPasaje() {

        valorPasaje = (numeroKilometros * 0.15)
                + (tarifaBase + (tarifaBase * (adicional / 100)));
    }

    public double obtenerAdicional() {
        return adicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Porcentaje Adicional:% .2f\n"
                + "Valor Del Pasaje: %.2f\n",
                 super.toString(),
                obtenerAdicional(), getValorPasaje());

        return cadena;
    }
}
