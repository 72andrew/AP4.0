/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una cadena");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        char charAux;
        int intAux;
        String cadenaAux = "";

        for (int i = 0; i < cadena.length(); i++) {
            intAux = cadena.charAt(i);
            intAux += 1;
            charAux = (char) intAux;
            cadenaAux = cadenaAux.concat(Character.toString(charAux));
            
        }
        cadena = cadenaAux;
        System.out.println("");
        System.out.println(cadena);
     
        cadenaAux = "";
        for (int i = 0; i < cadena.length(); i++) {
            intAux = cadena.charAt(i);
            intAux -= 1;
            charAux = (char) intAux;
            cadenaAux = cadenaAux.concat(Character.toString(charAux));
        }
        System.out.println("");
        System.out.println(cadenaAux);
    }

}
