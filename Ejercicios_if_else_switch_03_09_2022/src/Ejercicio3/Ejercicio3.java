
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Ingrese un numero: ");
        num1 = en.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = en.nextInt();
        
        if (num1 < num2) {
            System.out.println("El orden es: "+num2+ " "+num1);
        }
        
        else if (num1 == num2) {
            System.out.println("Son iguales");
        }
        else{
            System.out.println("El orden es: "+num1+ " "+num2);
        }
    }
}
