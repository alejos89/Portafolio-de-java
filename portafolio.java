import java.util.Scanner;

public class portafolio {

    public static void main(String[] args) {
        
        Scanner global=new Scanner(System.in);
        int opcion;

        do {
            System.out.println("");
            System.out.println("");
           System.out.println("   #                                     ");
           System.out.println("  # #   #      ######      #  ####       ");
           System.out.println(" #   #  #      #           # #    #      ");
           System.out.println("#     # #      #####       # #    #      ");
           System.out.println("####### #      #           # #    #      ");
           System.out.println("#     # #      #      #    # #    #      ");
           System.out.println("#     # ###### ######  ####   ####       ");
            System.out.println("");
            System.out.println("");
            

            System.out.println("Selecciona una opcion para continuar");
           
            System.out.println("[1] La suma de 2 números");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[4]");
            System.out.print("[Elija la opción]");
            
            opcion=global.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                  System.out.println("Ingrese el primer número");
                  int num1=global.nextInt();

                  System.out.println("Ingrese el segundo número");
                  int num2=global.nextInt();

                  int resultado=num1+num2;
                  System.out.println("El resultado es "+resultado);


                    
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    break;
            
                default:
                    break;
            }
        } while (opcion!=0);
    }
}