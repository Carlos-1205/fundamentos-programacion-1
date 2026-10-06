
public class Main {
    public static void main(String[] args) {
        int a=8+4*3;
        int b=(8+4)*3;
        double c=25/4;
        double d=25%4;
        int e=10+18/3*2;
         System.out.println("A = "+a);
         System.out.println("B = "+b);
         System.out.println("C = "+c);
         System.out.println("D = "+d);
         System.out.println("E = "+e);

        //¿Por que la A y B dan resultados diferentes?
        //Por la jerarquia de signos, y tomando en cuenta esa jerarquia en la A se resuelve primero la multiplicacion.
        //En la B primero se resuelve lo que esta dentro del parentesis ya que asi se plantea en la jerarquia

    }
}
