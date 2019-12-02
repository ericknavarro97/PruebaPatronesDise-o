/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.pd.creacional;

import java.lang.reflect.Field;

/**
 *
 * @author ericknavarro
 */
public class PruebaPatronDiseno {

    public static void main(String[] args) {

        PresidenteSingleton presidente = PresidenteSingleton.getInstance();

        System.out.println(presidente);

        presidente.setNombre("Juan");
        presidente.setPais("Mexico");

        presidente = PresidenteSingleton.getInstance();

        System.out.println(presidente);

        Bebida bebida = BebidaFactory.getBedibida("refresco");
        System.out.println(bebida.consultar());

        Bebida jugo = BebidaFactory.getBedibidaByTipoComida("desayuno");
        System.out.println(jugo.consultar());
        
        Class sa = jugo.getClass();
        
        Field[] a = sa.getFields(); //Obtiene un array de todos los nombres de los atributos de la clase
        
        for(Field at : a){
        
            System.out.println(at.getName());
            
        }

    }

}
