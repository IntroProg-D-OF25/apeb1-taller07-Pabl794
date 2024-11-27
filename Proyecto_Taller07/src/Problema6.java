/**
 *Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: 
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente, 
 * no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Problema6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reporte = "Reporte de Ventas:\n";
        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese el nombre del cliente " + i + ":");
            String nombreCliente = scanner.nextLine();
            System.out.print("Ingrese el costo de la computadora:");
            double costoComputadora = scanner.nextDouble();
            System.out.print("Ingrese el tipo de cliente (1, 2, u otro):");
            int tipoCliente = scanner.nextInt();
            double descuento = 0;
            if (tipoCliente == 1) {
                descuento = 0.10 * costoComputadora; 
            } else if (tipoCliente == 2) {
                descuento = 0.20 * costoComputadora;
            }
            double precioFinal = costoComputadora - descuento;
            reporte += String.format("%s, compra computadora con precio $%.2f (descuento aplicado $%.2f)\n",nombreCliente, precioFinal, descuento);
            scanner.nextLine();
        }
        System.out.println("\n" + reporte);
    }
}
/*
Ingrese el nombre del cliente 1:pablo
Ingrese el costo de la computadora:200
Ingrese el tipo de cliente (1, 2, u otro):1
Ingrese el nombre del cliente 2:pedro
Ingrese el costo de la computadora:300
Ingrese el tipo de cliente (1, 2, u otro):2
Ingrese el nombre del cliente 3:ana
Ingrese el costo de la computadora:304
Ingrese el tipo de cliente (1, 2, u otro):3
Ingrese el nombre del cliente 4:luis
Ingrese el costo de la computadora:400
Ingrese el tipo de cliente (1, 2, u otro):5
Ingrese el nombre del cliente 5:karen
Ingrese el costo de la computadora:1000
Ingrese el tipo de cliente (1, 2, u otro):2
Ingrese el nombre del cliente 6:anabel
Ingrese el costo de la computadora:2000
Ingrese el tipo de cliente (1, 2, u otro):3
Ingrese el nombre del cliente 7:david
Ingrese el costo de la computadora:259
Ingrese el tipo de cliente (1, 2, u otro):1

Reporte de Ventas:
pablo, compra computadora con precio $180,00 (descuento aplicado $20,00)
pedro, compra computadora con precio $240,00 (descuento aplicado $60,00)
ana, compra computadora con precio $304,00 (descuento aplicado $0,00)
luis, compra computadora con precio $400,00 (descuento aplicado $0,00)
karen, compra computadora con precio $800,00 (descuento aplicado $200,00)
anabel, compra computadora con precio $2000,00 (descuento aplicado $0,00)
david, compra computadora con precio $233,10 (descuento aplicado $25,90)
*/