/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egg.guia4;

import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean primo;
        System.out.println("Ingrese un numero");
        int num=sc.nextInt();
        primo=EsPrimo(num);
        System.out.println(primo);
    }
    
    public static boolean EsPrimo(int num) {
         boolean EsPrimo;
         int cont=0;
         for (int i=1; i<=num; i++){
            if (num%i==0){
             cont=cont+1;
            }
         }
         if (cont!=2){
             EsPrimo=false;
         }else{
             EsPrimo=true;
         }
         return EsPrimo;
    }
    
}
