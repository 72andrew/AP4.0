/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Usuario {

    List<Automovil> autos = new ArrayList<>();
    double ingresos;
    int cantInmuebles;
    int aviones;
    int barcos;
    boolean titularActivosSocietarios;

    public Usuario() {
    }

    public Usuario(double ingresos, int cantInmuebles, int aviones, int barcos, boolean titularActivosSocietarios) {
        this.ingresos = ingresos;
        this.cantInmuebles = cantInmuebles;
        this.aviones = aviones;
        this.barcos = barcos;
        this.titularActivosSocietarios = titularActivosSocietarios;
    }
    
    
    public List<Automovil> getAutos() {
        return autos;
    }

    public void setAutos(List<Automovil> autos) {
        this.autos = autos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public int getCantInmuebles() {
        return cantInmuebles;
    }

    public void setCantInmuebles(int cantInmuebles) {
        this.cantInmuebles = cantInmuebles;
    }

    public int getAviones() {
        return aviones;
    }

    public void setAviones(int aviones) {
        this.aviones = aviones;
    }

    public int getBarcos() {
        return barcos;
    }

    public void setBarcos(int barcos) {
        this.barcos = barcos;
    }

    public boolean isTitularActivosSocietarios() {
        return titularActivosSocietarios;
    }

    public void setTitularActivosSocietarios(boolean titularActivosSocietarios) {
        this.titularActivosSocietarios = titularActivosSocietarios;
    }
    

    
}
