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
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String nom, String ce, String or, String de,
            double num, double ta, double pa, double adi) {
        super(nom, ce, or, de, num, ta, pa);

    }

    @Override
    public void setValorPasaje() {

        valorPasaje = (numeroKilometros * 0.5)
                + ((tarifaBase / 2));
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Valor Del Pasaje: %.2f\n",
                 super.toString(), getValorPasaje());

        return cadena;
    }
}
