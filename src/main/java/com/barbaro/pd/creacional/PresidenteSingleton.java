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
public class PresidenteSingleton {
    
    private static PresidenteSingleton instance;
    
    private String nombre;
    private String pais;
    
    private PresidenteSingleton(){}
    
    public static PresidenteSingleton getInstance(){
    
        if(instance == null)
            instance = new PresidenteSingleton();
        
        return instance;
    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
    
}
