package programas;

import java.util.Scanner;

public class numeroM2 {

    public static void numeroM2(){

        Scanner numeros=new Scanner(System.in);

        System.out.println("Ingrese el primero numero");
        int num1=numeros.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2=numeros.nextInt();


        int mayor=num1;
        int menor=num1;

        if (num2>mayor){
            mayor=num2;  
        }

        if (num2<menor) {
            menor=num2;
            
        }

        System.out.println("El número mayor es "+mayor+",y el menor "+ menor);



    }
}