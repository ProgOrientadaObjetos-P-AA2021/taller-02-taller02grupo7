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
public abstract class PasajeInterCantonal implements Serializable{
    private String nombreCliente;
    private String cedula;
    private String origen;
    private String destino;
    private double numeroKilometros;
    private double tarifaBase;
    public double valorPasaje;
    public PasajeInterCantonal(String nom, String ced, String origen,String
            destino, double numKil, double tarifa, double pasaje){
        
        
    }
    public abstract getValorPasaje();
    
    
    
    
    @Override
    public String toString(){
        return String.format("Pasaje.");
    }
    
    
}
