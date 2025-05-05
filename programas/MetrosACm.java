package programas;

import java.util.Scanner;

public class MetrosACm {

    public static void conversion1(){

        Scanner metrosE=new Scanner(System.in);

        System.out.println("Ingrese su cantidad en metros");
        int metros=metrosE.nextInt();

        System.out.println(metros+"metros equivalen a "+(metros*100)+" centímetros");


    }
}