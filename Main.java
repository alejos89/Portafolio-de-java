import java.util.Scanner;

import programas.opciones;
import vistas.vistas;



public class Main {

    public static void main(String[] args) {
        
        Scanner global=new Scanner(System.in);
        int opcion;

        do {
            vistas.banner();

            programas.opciones.opciones();

            System.out.println("[0] Salir");
            System.out.println("Ingrese una opción");

           

            
           


         opcion=global.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                 
              programas.Sumar.Sumar();


                    
                    break;

                    case 2:

                    programas.Resta.Resta();
                    break;

                    case 3:
                    programas.Multi.Multi();
                    break;

                    case 4:
                    programas.Divi.Division();
                    break;

                    case 5:
                    programas.modulo.modulo();
                    break;

                    case 6:
                    programas.promedio3N.promedio();
                    break;

                    case 7:
                    programas.numeroM2.numeroM2();
                    
                    break;

                    case 8:
                    programas.numeroM3.numerosM3();
                    break;

                    case 9:
                    programas.MetrosACm.conversion1();
                    break;

                    case 10:
                    programas.KgAG.conversion2();
                    break;
            
                default:
                    break;
            }
        } while (opcion!=0);
    }
}