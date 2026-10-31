import java.util.Scanner;

public class RentaCamaras {
    public static double calcularRenta(double tarifa, double horas) {
        return tarifa * horas;
    }
    public static void mostrarComprobante(double total) {
        System.out.println("COMPROBANTE DE RENTA");
        System.out.println("Costo total apagar: $" + total);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("SISTEMA DE RENTA DE CAMARAS");
         System.out.println("Ingrese la tarifa de alquiler por hora $: ");
         double tarifa = scanner.nextDouble();
         if (tarifa <= 0) {
             System.out.println("Error: La tarifa debe ser mayor que cero.");
             return;
         }
         System.out.println("Ingrese la cantidad de horas de uso: ");
         double horas = scanner.nextDouble();

         if (horas <= 0) {
             System.out.println("Error: Las horas deben ser mayor que cero.");
             return;
         }
         double totalRenta = calcularRenta(tarifa, horas);
         mostrarComprobante(totalRenta);
    }
}
