/**
 *Generar e imprimir la siguiente serie:
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Problema7 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite de la serie:");
        int limite = scanner.nextInt();
        String serie = "";
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) { 
                serie += "+(1/" + i + ")";
            } else { 
                serie += "-(1/" + i + ")";
            }
        }
        System.out.println("Serie generada:");
        System.out.println(serie);
    }
}
/*
Ingrese el límite de la serie:
7
Serie generada:
-(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)
*/