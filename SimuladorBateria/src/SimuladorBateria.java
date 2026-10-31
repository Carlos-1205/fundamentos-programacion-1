import java.util.Scanner;

public class SimuladorBateria {
    public static int calcularMinutos(int porcentajeInicial) {
        int minutos = 0;
        int bateriaActual = porcentajeInicial;

        while(bateriaActual < 100) {
            bateriaActual +=8;
            minutos++;
        }
        return minutos;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar;

        do{
            System.out.println("SIMULADOR DE CARGA DE BATERIA");
            System.out.println("Ingrese el porcentaje inicial de la bateria: ");
            int porcentaje = scanner.nextInt();

            if(porcentaje < 0 || porcentaje > 100) {
                System.out.println("Error: El porcentaje debe ser un valor entre 0 y 100.");
            }else{
                int minutosTotales=calcularMinutos(porcentaje);

                System.out.println("Bateria inicial: " + porcentaje + "%");
                System.out.println("Minutos necesarios: " + minutosTotales);
            }
            System.out.println("¿Desea realizar otra simulacion? (1:Si, 2:No): ");
            continuar = scanner.nextInt();
        }while (continuar==1);
        System.out.println("¡Gracias por usar el simulador!");
    }
}
