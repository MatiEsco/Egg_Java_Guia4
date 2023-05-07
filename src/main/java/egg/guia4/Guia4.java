/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package egg.guia4;

import java.util.Scanner;

/**
 *
 * @author MatiPC
 */
public class Guia4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres: ");
        String frase = sc.nextLine();
        String codificado = codificar(frase);
        System.out.println("Secuencia codificada: " + codificado);
    }
    
    public static String codificar(String secuencia) {
        String codificado = "";
        for (int i = 0; i < secuencia.length(); i++) {
            char c = secuencia.charAt(i);
            switch (c) {
                case 'a', 'A':
                    codificado += '@';
                    break;
                case 'e','E':
                    codificado += '#';
                    break;
                case 'i','I':
                    codificado += '$';
                    break;
                case 'o','O':
                    codificado += '%';
                    break;
                case 'u','U':
                    codificado += '*';
                    break;
                default:
                    codificado += c;
            }
        }
        return codificado;
    }
}
