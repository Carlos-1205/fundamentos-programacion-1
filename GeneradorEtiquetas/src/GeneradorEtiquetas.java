import java.util.Scanner;

public class GeneradorEtiquetas {
    public static void mostrarEtiqueta(String numeroGuia, String ciudadDestino, double pesokg) {
        System.out.println("ETIQUETA DE ENVIO");
        System.out.println("Numero de guia: " + numeroGuia);
        System.out.println("Ciudad Destino: " + ciudadDestino);
        System.out.println("Peso : " + pesokg + "kg");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del paquete 1 ");
        System.out.println("Numero de guia: ");
        String guia1 = scanner.nextLine();

        System.out.println("Ciudad de destino: ");
        String destino1 = scanner.nextLine();

        System.out.println("Peso en kg: ");
        double peso1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese los datos del paquete 2 ");
        System.out.println("Numero de guia: ");
        String guia2 = scanner.nextLine();

        System.out.println("Ciudad de destino: ");
        String destino2 = scanner.nextLine();

        System.out.println("Peso en kg: ");
        double peso2 = scanner.nextDouble();

        mostrarEtiqueta(guia1, destino1, peso1);
        mostrarEtiqueta(guia2, destino2, peso2);
    }
}
