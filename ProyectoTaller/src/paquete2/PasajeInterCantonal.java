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
    private
    public PasajeInterCantonal(String nom, String ced, String origen,String
            destino, double numKil, double tarifa, double pasaje){
        
        
    }
    
    
    @Override
    public String toString(){
        return String.format("Pasaje.");
    }
    
    
}
