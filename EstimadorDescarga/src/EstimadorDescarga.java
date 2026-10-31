import java.util.Scanner;

public class EstimadorDescarga {
    public static double calcularTiempo(double tamanoMb, double velocidadMbS) {
        return tamanoMb / velocidadMbS;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ESTIMADOR DE TIEMPO DE DESCARGA");
        System.out.println("Ingrese el tamaño del archivo en MB: ");
        double tamano = scanner.nextDouble();

        if (tamano < 0) {
            System.out.println("Error: El tamaño del archivo no puede ser negativo. ");
            return;
        }
        System.out.println("Ingrese la velocidad de descarga en MB/s: ");
        double velocidad = scanner.nextDouble();
        if (velocidad <= 0) {
            System.out.println("Error: La velocidad de descarga debe ser mayor que cero. ");
            return;
        }
        double tiempoEstimado = calcularTiempo(tamano, velocidad);
        System.out.println("Tiempo estimado de descarga: " + tiempoEstimado + "segundos. ");
    }
}
