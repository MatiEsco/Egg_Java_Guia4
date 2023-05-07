/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
validando que el primer número múltiplo del segundo e imprima si el primer número es 
múltiplo del segundo, sino informe que no lo son.

 */
package egg.guia4;
import java.util.Scanner;
/**
 *
 * @author MatiPC
 */
public class Teoria_Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        
        System.out.print("Ingrese num1:");
        n1 = leer.nextInt();
        System.out.println();
        n2=leer.nextInt();
        mostrarInfo(n1,n2);
    }
    
    public static void mostrarInfo(int num1, int num2){
        if(num1 % num2 ==0){
            System.out.println("Son multiplos!");
        }else{
            System.out.println("No son multiplos");
        }
    }
}
