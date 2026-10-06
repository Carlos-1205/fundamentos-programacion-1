import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la temperatura: ");
        double temp = input.nextDouble();
        if (temp < 10) {
            System.out.println("Frio extremo");
        } else if (temp <= 20) {
            System.out.println("Clima fresco");
        } else if (temp <= 30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }
    }
}
