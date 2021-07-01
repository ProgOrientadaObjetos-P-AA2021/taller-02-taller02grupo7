/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();       
        
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
        
        PasajeMenorEdad pME = new PasajeMenorEdad("Juan", "150068", "Estacion 1",
                "Estacion 2", 1585, 5, 2);
        PasajeNormal pN = new PasajeNormal("Juan", "150068", "Estacion 4",
                "Estacion 2", 1565, 12, 2);
        PasajeUniversitario pU = new PasajeUniversitario("Juan", "150068",
                "Estacion 4","Estacion 1", 1825, 12,"UTPL");
        PasajeTerceraEdad PE3 = new PasajeTerceraEdad("Juan", "150068", 
                "Estacion 3","Estacion 2", 1575, 5);
        pasajes.add(pME);
        pasajes.add(pN);
        pasajes.add(pU);
        pasajes.add(PE3);
        
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).setPasajeInterCantonal();
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
