
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantas personas quiere ingresar?");
        int pers=sc.nextInt();
        EsMayor(pers);
    }
    public static void EsMayor(int pers){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<pers; i++){
            System.out.println("Ingrese el nombre de la persona " + i);
            String nom=sc.next();
            System.out.println("Que edad tiene " + nom);
            int edad=sc.nextInt();
            if (edad<18){
                System.out.println(nom + " es menor de edad.");
            }else{
                System.out.println(nom + " es mayor de edad.");
            }
            System.out.println("Quiere continuar ingresando personas (si/no)?");
            String rta=sc.next();
            if (rta.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}