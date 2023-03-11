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
public class PuntoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeritos[] = new int[3];
        int num1=22;
        int num2=5;
        int num3=13;
        
        System.out.println("como queres ordenar");
        System.out.println("1-descendente");
        System.out.println("2-ascendente");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
                
        switch (opcion) {
            case 1:
                if (num1>num2) {
                    if (num1>num3) {
                        numeritos[0] = num1;
                        if (num3>num2) {
                            numeritos[1]=num3;
                            numeritos[2]=num2;
                        }
                    }else{
                        numeritos[0] = num3;
                        numeritos[1] = num1;
                        numeritos[2] = num2;
                    }
                }else{
                    if(num2>num3){
                        numeritos[0] = num2;
                        if(num3>num1){
                            numeritos[1]=num3;
                            numeritos[2]=num1;
                        }else{
                        numeritos[0] = num3;
                        numeritos[1] = num2;
                        numeritos[2] = num1; 
                        }
                            
                    }
                        
                }
                break;
            case 2:
                if (num1<num2) {
                    if (num1<num3) {
                        numeritos[0] = num1;
                        if (num3<num2) {
                            numeritos[1]=num3;
                            numeritos[2]=num2;
                        }
                    }else{
                        numeritos[0] = num3;
                        numeritos[1] = num1;
                        numeritos[2] = num2;
                    }
                }else{
                    if(num2<num3){
                        numeritos[0] = num2;
                        if(num3<num1){
                            numeritos[1]=num3;
                            numeritos[2]=num1;
                        }else{
                        numeritos[0] = num3;
                        numeritos[1] = num2;
                        numeritos[2] = num1; 
                        }
                            
                    }
                        
                }                
                
                break;
            default:
                throw new AssertionError();
        }
       
        System.out.println("");
        for (int numerito : numeritos) {
            System.out.println(numerito);
        }
    }
}
