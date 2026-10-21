import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);

        int puntosAcumulados=0;
        int partidasMas1000=0;
        int menoresOIguales=0;

        for(int i =1; i<= 7; i++ ) {
            System.out.println("Ingresa los puntos de la partida " + i + ":");
            int puntos= teclado.nextInt();
            puntosAcumulados += puntos;

            if (puntos > 1000){
                partidasMas1000 ++;
            }else{
                menoresOIguales++;
            }
        }
        double promedio = (double) puntosAcumulados / 7;

        System.out.println("Puntos acumulados: " + puntosAcumulados);
        System.out.println("Promedio de puntuacion: " + promedio);
        System.out.println("Partidas con mas de 1000 puntos: " + partidasMas1000);
        System.out.println("Partidas con 1000 puntos o menos: " + menoresOIguales);
    }



}
