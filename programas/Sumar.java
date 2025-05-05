package programas;

import java.util.Scanner;

public class Sumar {

    public static void Sumar(){

        Scanner scanN=new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1=scanN.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2=scanN.nextInt();

        int resultado=num1+num2;
        System.out.println("el resultado es "+resultado);

        
    };
}