import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peso = -1;
        int tipo = 0;
        int fragil = 0;
        double costo = 0;
        String nombreTipo = "";

        int aceptados = 0;
        int rechazados = 0;
        int fragiles = 0;
        double totalDinero = 0;
        double costoMayor = 0;

        while (true) {
            System.out.print("Ingresa el peso del paquete en kg (0 para terminar): ");
            peso = sc.nextInt();

            if (peso == 0) {
                break; // Termina el registro sin pedir más datos
            }

            if (peso < 0) {
                System.out.println("El peso no puede ser negativo. Intenta de nuevo.");
                continue; // Pide el peso otra vez sin contarlo
            }

            do {
                System.out.print("Tipo de envío (1 Local, 2 Nacional, 3 Express): ");
                tipo = sc.nextInt();
                if (tipo < 1 || tipo > 3) {
                    System.out.println("Opción no válida. Elige 1, 2 o 3.");
                }
            } while (tipo < 1 || tipo > 3);

            boolean esAceptado = false;

            if (tipo == 1) {
                nombreTipo = "Local";
                if (peso <= 12) {
                    esAceptado = true;
                    costo = 30 + (8 * peso);
                }
            } else if (tipo == 2) {
                nombreTipo = "Nacional";
                if (peso <= 20) {
                    esAceptado = true;
                    costo = 50 + (12 * peso);
                }
            } else if (tipo == 3) {
                nombreTipo = "Express";
                if (peso <= 5) {
                    esAceptado = true;
                    costo = 80 + (20 * peso);
                }
            }

            if (!esAceptado) {
                System.out.println("Paquete rechazado");
                rechazados++;
            } else {
                aceptados++;

                do {
                    System.out.print("¿Es frágil? (1 Sí, 2 No): ");
                    fragil = sc.nextInt();
                    if (fragil != 1 && fragil != 2) {
                        System.out.println("Opción no válida. Elige 1 o 2.");
                    }
                } while (fragil != 1 && fragil != 2);

                if (fragil == 1) {
                    costo += 25;
                    fragiles++;
                }

                totalDinero += costo;
                if (costo > costoMayor) {
                    costoMayor = costo;
                }

                System.out.println("--- Paquete Aceptado ---");
                System.out.println("Tipo de envío: " + nombreTipo);
                System.out.println("Peso: " + peso + " kg");
                System.out.println("Total a pagar: $" + costo);
                System.out.println("------------------------");
            }
        }

        System.out.println("\n=== RESUMEN DEL DÍA ===");
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Frágiles aceptados: " + fragiles);
        System.out.println("Dinero recaudado: $" + totalDinero);
        System.out.println("Costo más alto: $" + costoMayor);


    }
}