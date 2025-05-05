package programas;

import java.util.Scanner;

public class modulo {

    public static void modulo(){

        Scanner moduloN=new Scanner(System.in);
        System.out.println("Ingrese el primer núnero");
        double num1=moduloN.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2=moduloN.nextDouble();



        System.out.println("El residuo de "+num1+"/"+num2+" es "+(num1%num2));
    }
}