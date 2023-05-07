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
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int opc;
        System.out.println("Cuantos euros tiene en su bolsillo?");
        int euros=sc.nextInt();
        do{
        System.out.println("A que moneda desea convertir sus euros?");
        System.out.println("1. Dolar");
        System.out.println("2. Yenes");
        System.out.println("3. Libras");
        System.out.println("4. Salir");
        opc=sc.nextInt();
        String cambio="";
        switch (opc){
            case 1:
                cambio= "dolar";
                break;
            case 2:
                cambio= "yenes";
                break;
            case 3:
                cambio="libras";
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("El cambio elegido es incorrecto.");
                break;
        }
        Moneda(euros,cambio);
        }while (opc!= 4);
    }
     public static void Moneda(int euros, String cambio){
        Scanner sc=new Scanner(System.in);
        
        switch (cambio){
            case "dolar":
                double aux=euros*1.28611;
                System.out.println("El valor del cambio a dolares es: " + aux);
                break;
            case "yenes":
                aux=euros*129.852;
                System.out.println("El valor del cambio a yenes es: " + aux);
                break;
            case "libras":
                aux=euros*0.86;
                System.out.println("El valor del cambio a libras es: " + aux);
                break;
            
        }
    }
    
}
