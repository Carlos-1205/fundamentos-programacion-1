
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] calificaciones = capturarCalificaciones(teclado);
        mostrarCalificaciones(calificaciones);
        int aprobados = contarAprobados(calificaciones);
        int reprobados = contarReprobados(calificaciones);

        System.out.println("\n--- Resultados finales ---");
        System.out.println("Total de alumnos aprobados: " + aprobados);
        System.out.println("Total de alumnos reprobados: " + reprobados);

        teclado.close();
    }

    public static int[] capturarCalificaciones(Scanner teclado) {
        int[] calificaciones = new int[10];
        int i = 0;

        while (i < 10) {
            System.out.print("Ingresa la calificación del Alumno " + (i + 1) + " (0 a 100): ");
            int calif = teclado.nextInt();

            if (calif >= 0 && calif <= 100) {
                calificaciones[i] = calif;
                i++;
            } else {
                System.out.println("Error: la calificación debe estar entre 0 y 100.");
            }
        }

        return calificaciones;
    }

    public static void mostrarCalificaciones(int[] calificaciones) {
        System.out.println("\n--- Lista de calificaciones ---");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }
    }

    public static int contarAprobados(int[] calificaciones) {
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 70) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarReprobados(int[] calificaciones) {
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] < 70) {
                contador++;
            }
        }
        return contador;
    }
}