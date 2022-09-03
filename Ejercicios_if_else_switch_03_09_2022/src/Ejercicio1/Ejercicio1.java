
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Ingrese un numero: ");
        num1 = en.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = en.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los dos numeros son iguales");
        }
        else{
            System.out.println("Los numeros son diferentes");
        }
        
    }
}
