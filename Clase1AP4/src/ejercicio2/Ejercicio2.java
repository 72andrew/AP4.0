/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author andre
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Usuario user = new Usuario(500000, 3, 1, 1, true);
        Automovil auto1 = new Automovil("Ford", "Focus", 2020);
        Automovil auto2 = new Automovil("Chevrolet", "Corsa", 2019);
        Automovil auto3 = new Automovil("Renault", "Clio", 2021);
        List<Automovil> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        
        user.setAutos(autos);
        int anioActual = 2023;
        int contadorAutos = 0;
        
        for (Automovil auto : user.getAutos()) {
            if (anioActual-auto.getAnio()<=5) {
                contadorAutos++;
            }
            
        }
        
        if (user.getIngresos()>489083 
            && contadorAutos>=3 
            && user.getCantInmuebles()>=3 
            && (user.getAviones() >=1
            || user.getBarcos() >= 1
            || user.isTitularActivosSocietarios())) {
            
            System.out.println("Ingresos Altos");
        }else{
            System.out.println("No es Ingresos Bajos");
        }
        
    }
    
}
