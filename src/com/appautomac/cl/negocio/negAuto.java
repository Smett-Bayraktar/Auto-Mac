/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appautomac.cl.negocio;

import com.appautomac.cl.entidades.Auto;
import java.util.ArrayList;

/**
 *
 * @author 21cam
 */
public class negAuto {
    
    private ArrayList<Auto> listaAut;
    
    //Metodo constructor
    public negAuto(){
        listaAut = new ArrayList<Auto>();
    }
    
    //Listar 
    public ArrayList<Auto> listarTodo()
    {
        return listaAut;
    }
    
    //Agregar
    public boolean agregarAuto (Auto aut){
        if (aut.getTipoEnergia() == 0 || aut.getPatente().isEmpty() || aut.getMarca().isEmpty() || aut.getModelo().isEmpty() ) {
            return false;
        }
        listaAut.add(aut);
        return true;
    }
}
