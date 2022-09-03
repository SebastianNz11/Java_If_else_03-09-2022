
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = en.nextInt();
        if (num < 0) {
            System.out.println("El numero es negativo");
        }
        
        else if (num == 0) {
            System.out.println("El numero es cero");
        }
        
        else{
            System.out.println("El numero es positivo");
        }
    }
           
//}
