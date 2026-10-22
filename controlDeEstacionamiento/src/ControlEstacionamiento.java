import java.util.Scanner;

public class ControlEstacionamiento {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);

     int totalCarros=0;
     double totalRecaudado=0.0;
     int carrosConDescuento=0;

     System.out.println("Instrucciones: Ingrese las horas de estacionado ");
     while(true){
         System.out.println("Ingrese la cantidad de horas estacionado: ");

         if(!scanner.hasNextDouble()){
             System.out.println("Error: Por favor, ingrese un valor numerico valido.");
             scanner.next();
             continue;
         }
         double horas=scanner.nextDouble();
         if(horas==0){
             break;
         }
         if(horas<0){
             System.out.println("Error: Las horas negativas no son validas. Intente de nuevo");
             continue;
         }
         double pagoBase=horas * 15;
         double pagoFinal;
         if(horas>5){
             pagoFinal=pagoBase -10;
             carrosConDescuento++;
         }else{
             pagoFinal=pagoBase;
         }
         totalCarros++;
         totalRecaudado+=pagoFinal;
         System.out.println("Total a pagar: $" + pagoFinal);
     }
     System.out.println("Total de carros atendidos: " +  totalCarros);
     System.out.println("Total recaudado: $" +  totalRecaudado);
     System.out.println("AutosConDescuento: $" +  carrosConDescuento);
     if(totalCarros>0){
         double promedio=totalRecaudado/totalCarros;
         System.out.println("Promedio pagado por carro: $" +  promedio);

     }else{
         System.out.println("Promedio pagado por carro: $0.00");
     }
    }
}
