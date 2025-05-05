package programas;

import java.util.Scanner;

public class KgAG {

    public static void conversion2(){
        
        Scanner kilogramosE= new Scanner(System.in);

        System.out.println("Ingrese su cantidad en kilogramos");
        int kilogramos=kilogramosE.nextInt();

        System.out.println(kilogramos+" kilogramos equivalen a "+(kilogramos*1000)+" gramos");
    }
}