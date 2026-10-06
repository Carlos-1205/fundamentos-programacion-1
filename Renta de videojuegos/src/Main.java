import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double COSTO= 60;
        int EDAD= 15;
         System.out.println("Ingrese su edad: ");
         int edad= teclado.nextInt();
         System.out.println("Ingrese su saldo: ");
         double saldo= teclado.nextDouble();
         if(edad>=EDAD && saldo>=COSTO) {
             if(saldo==COSTO) {
                 System.out.println("Permitido (pago con la cantidad exacta) ");
             }else{
                 System.out.println("Permitido (pago realizado y sobra saldo");
             }
         } else if(edad<EDAD)   {
             System.out.println("Denegado ");
        } else{
             System.out.println("Denegado ");
         }

    }


}


