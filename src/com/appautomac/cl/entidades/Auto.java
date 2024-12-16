/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appautomac.cl.entidades;

/**
 *
 * @author oscar
 */
public class Auto extends Vehiculo{
    private int tipoEnergia;
    private boolean aireAcondicionado;

    public Auto() {
        super();
    }

    public Auto(int tipoEnergia, boolean aireAcondicionado, String patente, String marca, String modelo, int kilometraje) {
        super(patente, marca, modelo, kilometraje);
        this.tipoEnergia = tipoEnergia;
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(int tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    
    
}
