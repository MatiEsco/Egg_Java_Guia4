/*

 */
package egg.guia4;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int num1,num2;
        System.out.println("Ingresar n1: ");
        num1 = sc.nextInt();
        System.out.println("Ingresar n2: ");
        num2 = sc.nextInt();
        int op;
        
        
       do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion");
            op=sc.nextInt();
            switch (op){
                case 1:
                   int SumarAux=sumar(num1,num2);
                    System.out.println("El resultado es: " + SumarAux);
                    break;
                case 2:
                   int RestarAux=restar(num1,num2);
                   System.out.println("El resultado es: " + RestarAux);
                    break;
                case 3:
                   int MultAux=mult(num1,num2);
                   System.out.println("El resultado es: " + MultAux);
                    break;
                case 4:
                    int DivAux=div(num1,num2);
                    System.out.println("El resultado es: " + DivAux);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
        }
            
        } while (op!=5);
    }
    
     public static int sumar(int n1, int n2) {
         int sumar=0;
         sumar=n1+n2;
         return sumar;
    }
     public static int restar(int n1, int n2) {
         int restar=0;
         restar=n1-n2;
         return restar;
    }
     public static int mult(int n1, int n2) {
         int mult=0;
         mult=n1*n2;
         return mult;
    }
     public static int div(int n1, int n2) {
         int div=0;
         div=n1/n2;
         return div;
    }
}

