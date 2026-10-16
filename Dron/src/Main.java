import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Ingresa el procentaje de bateria inicial del dron: ");
         int bateriaI = scanner.nextInt();
         int min=1;
         int bateria=bateriaI;

         System.out.println("Bateria inicial: " + bateriaI + "%\n");
         while(bateria>=7){
             bateria-=7;
             System.out.println("Minuto "+ min +"->" + bateria + "%");
             min++;
        }
         System.out.println("Aterrizaje forzoso: El dron ya no tien el 7% necesario para seguir funcionando");
    }
}
