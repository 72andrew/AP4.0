/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author andre
 */
public class PuntoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Hola que tal";
        char letra = 'a';
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println(contador);
    }
    
}
