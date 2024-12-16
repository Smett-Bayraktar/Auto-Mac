/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appautomac.cl.negocio;
import com.appautomac.cl.entidades.Camioneta;
import java.util.ArrayList;

/**
 *
 * @author 21cam
 */
public class negCamioneta {
     private ArrayList<Camioneta> listaCamio;
    
    //Metodo constructor
    public negCamioneta(){
        listaCamio = new ArrayList<Camioneta>();
    }
    
    //Listar 
    public ArrayList<Camioneta> listarTodo()
    {
        return listaCamio;
    }
    
    //Agregar
    public boolean agregarCamioneta (Camioneta cam){
        if (cam.getPatente().isEmpty() || cam.getMarca().isEmpty() || cam.getModelo().isEmpty()) {
            return false;
        }
        listaCamio.add(cam);
        return true;
    }
}
