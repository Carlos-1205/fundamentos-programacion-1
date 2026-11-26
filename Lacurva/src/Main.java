public class Main {

    public static void main(String[] args) {
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

        System.out.println("--- Calificaciones originales ---");
        mostrarCalificaciones(calificaciones);

        aplicarCurva(calificaciones, 5);

        System.out.println("--- Calificaciones despues de la curva ---");
        mostrarCalificaciones(calificaciones);

        int aprobados = contarAprobados(calificaciones,70);
        System.out.println("Total de alumnos aprobados: " + aprobados);
    }

    public static void mostrarCalificaciones(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + arreglo[i]);
        }
    }

    public static void aplicarCurva(int[] arreglo, int puntosExtra) {
        for (int i = 0; i < arreglo.length; i++) {
            int nuevaCalificacion = arreglo[i] + puntosExtra;
            if (nuevaCalificacion > 100) {
                nuevaCalificacion = 100;
            }
            arreglo[i] = nuevaCalificacion;
        }
    }

    public static int contarAprobados(int[] arreglo, int calificacionMinima) {
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= calificacionMinima) {
                contador++;
            }
        }
        return contador;
    }
}
