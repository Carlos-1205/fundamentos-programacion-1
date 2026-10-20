import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        int puntos = 0;
        System.out.println("Seleccione la opcion que necesite: ");
        do {
            System.out.println("1- Ganar 20 puntos.");
            System.out.println("2- Gastar 15 puntos.");
            System.out.println("3- Consultar puntos.");
            System.out.println("4- Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    puntos += 20;
                    System.out.println("¡Haz ganado 20 puntos! Tienes en total: " + puntos);
                    break;
                case 2:
                    if (puntos >= 15) {
                        puntos -= 15;
                        System.out.println("Has gastado 15 puntos. Te quedan: " + puntos);
                    } else {
                    System.out.println("No tienes suficientes puntos (tienes " + puntos + ")");
                }
                break;
                case 3:
                    System.out.println("Tus puntos actuales son: " + puntos);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida, por favor seleccione entre 1 y 4. ");
            }
        } while (opc != 4);
        System.out.println("Tus puntos restantes son: " + puntos);
    }
}
