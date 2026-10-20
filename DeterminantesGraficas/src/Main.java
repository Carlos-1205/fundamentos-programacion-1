import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese los valores de la linea 1: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Ingresa los valores de la linea 2: ");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double det=(a * d) -  (b * c);
        System.out.println("El determinante es: " + det);
    }

}

