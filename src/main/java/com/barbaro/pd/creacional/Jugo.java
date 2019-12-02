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
public class Jugo extends Bebida {

    private String fruta;
    private String tipo;
    
    public Jugo() {
    }

    public Jugo(String fruta, String tipo) {
        super();
        this.fruta = fruta;
        this.tipo = tipo;
    }

    public Jugo(String nombre, String fruta, String tipo) {
        super(nombre);
        this.fruta = fruta;
        this.tipo = tipo;
    }
    
    

    /**
     * @return the fruta
     */
    public String getFruta() {
        return fruta;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param fruta the fruta to set
     */
    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String consultar() {
        return "Juguin";
    }
    
    
    
    
}
