/**
 *  Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Problema2 {
     public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite ,numerador = 5 , denominador = 10, cont = 0;
        System.out.print("Ingresa el limite:");
        limite = tcl.nextInt();
        while(cont < limite ){
            System.out.println(numerador + "/" + denominador );
            numerador += 5;
            denominador += 2;
            cont ++;
        }
     }    
}               
/*
Ingresa el limite:7
5/10
10/12
15/14
20/16
25/18
30/20
35/22
*/              



