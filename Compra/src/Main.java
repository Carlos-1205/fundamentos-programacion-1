import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("Ingrese su saldo: ");
    double saldo= teclado.nextDouble();
    System.out.println("Ingrese el costo de la compra: ");
    double costo= teclado.nextDouble();
     if(saldo>=costo){
     System.out.println("Si te alcanzo para la compra ");
        if(saldo==costo){
         System.out.println("Pagaste con las cantidad exacta de compra ");
     }else{
            System.out.println("Tu cambio es:$ "+(saldo-costo));
        }
     }else{

     }
    }

}



