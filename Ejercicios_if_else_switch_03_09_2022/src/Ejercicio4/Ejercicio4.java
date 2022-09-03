
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        int num1, num2,num3;
        System.out.println("Ingrese un numero: ");
        num1 = en.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = en.nextInt();
        System.out.println("Ingrese otro numero: ");
        num3 = en.nextInt();
        
        if (num1 < num2 && num2<num3 && num1 < num3) {
            System.out.println("El orden es: "+num3+" "+num2+" "+num1);
        }
        
        else if (num1 > num2 && num2>num3 && num1 > num3) {
            System.out.println("El orden es: "+num1+" "+num2+" "+num3);
        }
        
        else if (num1 > num2 && num2<num3 && num1 > num3) {
            System.out.println("El orden es: "+num1+" "+num3+" "+num2);
        }
        
        else if (num1 < num2 && num2>num3 && num2 > num1) {
            System.out.println("El orden es: "+num2+" "+num3+" "+num1);
    }   
        else if (num1 == num3  && num2 < num3) {
            System.out.println("El orden es: " + num3+" "+num1+" "+num2);
    }
        
          else if (num1 == num2  && num2 > num3) {
            System.out.println("El orden es: " + num2+" "+num1+" "+num3);
    }
          
          else if (num2 == num3  && num2 > num1) {
            System.out.println("El orden es: " + num3+" "+num2+" "+num1);
    }
          
           else if (num1 > num2 && num2<num3 && num1 < num3) {
            System.out.println("El orden es: " + num3+" "+num1+" "+num2);
    }
        
        else{
            System.out.println("Los tres son iguales");
        }
    
    }
}