package programas;

import java.util.Scanner;

public class Divi {

    public static void Division(){
        
        Scanner divN=new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1=divN.nextDouble();

        System.out.println("Ingrese el segundo número");
         double num2=divN.nextDouble();

         System.out.println("El resultado de la división es "+(num1/num2));
    
    }
}