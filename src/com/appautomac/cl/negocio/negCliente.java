/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appautomac.cl.negocio;

import com.appautomac.cl.datos.ClienteDAO;
import com.appautomac.cl.entidades.Auto;
import com.appautomac.cl.entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class negCliente {
    
    private ArrayList<Cliente> listaCli;
    
    //Constructor
    public negCliente(){
        listaCli = new ArrayList<Cliente>();
    }
    
    //Listar
    public ArrayList<Cliente> listarTodo()
    {
        return listaCli;
    }
    
    //Agregar
    public boolean agregarCliente (Cliente cli){
        if (cli.getRut().isEmpty() || cli.getNombreCompleto().isEmpty() || cli.getCorreo().isEmpty() || cli.getTelefono() < 7) {
            return false;
        }
        listaCli.add(cli);
        return true;
    }
    
    
}
