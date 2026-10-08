import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Bicicleta urbana ($40/hora)");
        System.out.println("2. Bicicleta de montaña ($60/hora)");
        System.out.println("3. Bicicleta electrica ($90/hora)");
        System.out.println("Elige una opcion entre (1,2,3): ");
        int opcion = teclado.nextInt();

        double tarifa=0;
        String tipoBicicleta="";
        boolean opcionValida=true;

        switch (opcion) {
            case 1:
                tipoBicicleta = "Bicicleta urbana";
                tarifa = 40;
                break;
            case 2:
                tipoBicicleta = "Bicicleta de montaña";
                tarifa = 60;
                break;
            case 3:
                tipoBicicleta = "Bicicleta electrica";
                tarifa = 90;
                break;
            default:
                opcionValida = false;
                System.out.println("Opcion no valida");
                break;
        }

        if (opcionValida) {
            System.out.println("Ingresa del tiempo de renta");
            int horas=teclado.nextInt();

            if (horas>0){
            System.out.println("¿El cliente tiene membresia?");
            boolean membresia=teclado.nextBoolean();
            double subtotal= tarifa*horas;
            double descuento=0;

            if (membresia){
                descuento=subtotal * 0.20;
            }
            double total= subtotal - descuento;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total: $" + total);
        } else {
                System.out.println("La cantidad de horas debe ser mayor a cero. ");
            }
        }

    }
}
