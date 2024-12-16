/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appautomac.cl.datos;

import com.appautomac.cl.entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class ClienteDAO {
    private ArrayList<Cliente> listaCli;
    
    public ClienteDAO(){
        listaCli = new ArrayList<Cliente>();
    }
    
    public ArrayList<Cliente> listarTodo(){
        return listaCli;
    }
    
    public boolean agregar (Cliente cli){
        if (cli.getRut().isEmpty() || cli.getNombreCompleto().isEmpty() || cli.getCorreo().isEmpty() || cli.getTelefono() == 0) {
            return false;
        }
        listaCli.add(cli);
        return true;
    }
    
}
