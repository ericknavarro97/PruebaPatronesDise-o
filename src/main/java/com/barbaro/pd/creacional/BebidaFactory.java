/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.pd.creacional;

/**
 *
 * @author ericknavarro
 */
public class BebidaFactory {
    
    public static Bebida getBedibida(String nombre){
    
        switch(nombre.toLowerCase()){
        
            case "refresco":
                return new Refresco(nombre, "manzanita");
            case "jugo":
                return new Jugo(nombre, "manzana", "dietética");
            default:
                return null;
        }
        
    }
    
    public static Bebida getBedibidaByTipoComida(String tipoComida){
    
        if(tipoComida.equalsIgnoreCase("desayuno"))
            return new Jugo();
        else if(tipoComida.equalsIgnoreCase("comida"))
            return new Refresco();
        else 
            return null;
        
    }
    
}
