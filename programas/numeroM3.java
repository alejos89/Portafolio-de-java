package programas;

import java.util.Scanner;

public class numeroM3 {

    public static void numerosM3(){

        Scanner numeros=new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1=numeros.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2=numeros.nextInt();

        System.out.println("Ingrese el tercer número");
        int num3=numeros.nextInt();

        int mayor=num1;

        int menor=num1;


        if (num2>mayor) {

            mayor=num2;
            
        }

        if (num3>mayor) {
            mayor=num3;
            
        }

        if (num2<menor) {
            menor=num2;

            if (num3<menor) {
                menor=num3;
                
            }

            System.out.println("El número mayor es "+mayor+", y el menor "+ menor);
            
        }
    }
}