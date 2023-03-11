/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class PuntoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeritos[] = {13,10,7,4,18};
        int valorX = 1;
        int sumatoria=0;
        System.out.println("Ingrese el valor X");
        Scanner sc = new Scanner(System.in);
        valorX = sc.nextInt();
        System.out.println("");
        for (int numerito : numeritos) {
            if (numerito>valorX) {
                sumatoria+= numerito;
            }
        }
        System.out.println(sumatoria);
        
        
    }
    
}
