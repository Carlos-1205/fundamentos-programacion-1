import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvennido a Hotel Stark");
        System.out.println("Ingrese el piso al que se encuentra: ");
        int piso=teclado.nextInt();

        System.out.println("Ingrese el piso al que desea ir: ");
        int pisof= teclado.nextInt();

        if(piso==0 || pisof==0 ){
            System.out.println("No se admite el piso 0");
        }else if(piso<=pisof){
            while (piso<=pisof) {
                System.out.println(piso);
                System.out.println("Usted esta subiendo por el piso ");
                piso += 1;
            }
        }else if (piso>=pisof){
            System.out.println(piso);
            System.out.println("Usted esta bajando por el piso ");
            piso--;
        }
        System.out.println("Usted a llegado al piso: "+pisof);
        }

        }


