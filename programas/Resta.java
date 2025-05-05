package programas;

import java.util.Scanner;

public class Resta {

    public static void Resta(){

        Scanner restaN=new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        double num1=restaN.nextDouble();

        System.out.println("Ingrese el segudno núnero");
        double num2=restaN.nextDouble();

        System.out.println("El resultado de la resta es "+ (num1-num2));

    }
}

