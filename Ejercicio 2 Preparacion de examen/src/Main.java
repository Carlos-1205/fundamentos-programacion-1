import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese los minutos que se mantuvo estacionado el auto: ");
         int minutos= teclado.nextInt();
         int costo= 18;
         int hora= 60;
          int horasCompletas= minutos / hora;
          int minutosRestantes= minutos % hora;
          int costoTotal= horasCompletas * costo;

          System.out.println("Horas completas:" +horasCompletas);
          System.out.println("Minutos restantes:" +minutosRestantes);
          System.out.println("El monto total es:" +costoTotal);
    }
}
