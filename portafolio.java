import java.util.Scanner;

public class portafolio {

    public static void main(String[] args) {
        
        Scanner global=new Scanner(System.in);
        int opcion;

        do {

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
           
            System.out.println("[1]");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[4]");
            System.out.print("[Elija la opción]");
            
            opcion=global.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                    
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