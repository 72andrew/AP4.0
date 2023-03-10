package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroInicioAux = numeroInicio;
        int numeroFinal = 14;
        int resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese:");
        System.out.println("1: Mostrar pares");
        System.out.println("2: Mostrar impares");
        int paridad = sc.nextInt();
        while(paridad<=0 || paridad >=3){
            System.out.println("opcion no validad, vuelva a ingresar");
            paridad = sc.nextInt();
        }
        if (paridad ==1) {
            resto = 0;
        }else{
            resto = 1;
        }
        System.out.println("");
        while (numeroInicio <= numeroFinal) {
            if (numeroInicio % 2 == resto) {
                System.out.print(numeroInicio + " ");

            }
            numeroInicio += 1;
        }
        
        System.out.println("");
        for (int i = numeroFinal; i >= numeroInicioAux; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
  
            }

        }
        System.out.println("");
    }

}
