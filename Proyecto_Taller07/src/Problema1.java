/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * @autor Pablo Velez
 */

import java.util.Scanner;
public class Problema1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, cont  = 1;
        System.out.print("Dame el limite:");
        limite = tcl.nextInt();
        while(cont <= limite){
            System.out.println(cont + "/" + (cont + 9) );
            cont++;
        }
    
    }
}
/*
Dame el limite:7
1/10
2/11
3/12
4/13
5/14
6/15
7/16
*/
