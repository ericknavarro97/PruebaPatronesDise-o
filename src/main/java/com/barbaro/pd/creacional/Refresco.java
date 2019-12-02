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
public class Refresco extends Bebida {
    
    private String sabor;

    public Refresco() {
    }

    public Refresco(String sabor) {
        super();
        this.sabor = sabor;
    }
    
    public Refresco(String nombre, String sabor) {
        super(nombre);
        this.sabor = sabor;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String consultar() {
        return "refresquin";
    }
    
    
    
}
