import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el promedio: ");
        double promedio=scanner.nextDouble();
        System.out.println("Ingrese el procentaje de asistencia");
        double asistencia=scanner.nextDouble();
        if (promedio < 7.0) {
            System.out.println("Reprobado por calificacion");
        } else if (asistencia <80.0) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Aprobado regular");
        }
    }
}
