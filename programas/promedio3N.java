package programas;

import java.util.Scanner;

public class promedio3N {

    public static void promedio(){
        
        Scanner promedioN=new Scanner(System.in);
        System.out.println("Ingrese el primero número");
        double num1=promedioN.nextDouble();

        System.out.println("Ingrese el segundo número");
        double num2=promedioN.nextDouble();

        System.out.println("Ingrese el tercer número");
        double num3=promedioN.nextDouble();

        double resultado= (num1+num2+num3)/(3);

        System.out.println("El promedio de los 3 numeros es "+resultado);
    }
}