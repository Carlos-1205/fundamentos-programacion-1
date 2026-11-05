//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int opc;
        int unidades = 100;
        int paquetes;
        int capacidadMax=250;

        System.out.println("Selecciones la opcion que necesite: ");

            System.out.println("MENU");
            System.out.println("1- Recibir ");
            System.out.println("2- Retirar ");
            System.out.println("3- Consultar");
            System.out.println("4- Finalzar ");
            opc= teclado.nextInt();
            switch(opc) {
                case 1:
                    System.out.println("Cuantas unidades quiere enviar: ");
                    
                    if(unidades<= capacidadMax);
                    break;
                case 2:
                    System.out.println("Cuantas unidades quiere retirar: ");
                    break;
                case 3:
                    System.out.println("Las unidades disponibles son: ");
                    break;
                case 4:
                    System.out.println("Finalizando....");
                    break;
                default:
                    System.out.println("Opcion invalida, seleccione una opcion entre 1 y 4.");
            }
            if (opc==1){
            }
        }while();
    }
}