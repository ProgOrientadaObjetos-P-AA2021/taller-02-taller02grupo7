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
public class PasajeUniversitario extends PasajeInterCantonal {

    private String uni;

    public PasajeUniversitario(String nom, String ce, String or, String de,
            double num, double ta, String u) {
        super(nom, ce, or, de, num, ta);

        uni = u;

    }

    public void establecerUniversidad(String x) {
        uni = x;
    }

    @Override
    public void setPasajeInterCantonal() {

        valorPasaje = ((tarifaBase / 2));
    }

    public String obtenerUniversidad() {
        return uni;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Nombre de la Universidad:%s\n"
                + "Descuento: %.2f\n",
                 super.toString(),
                obtenerUniversidad(), getPasajeIntercantonal());

        return cadena;
    }

}
