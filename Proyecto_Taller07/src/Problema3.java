/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Problema3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el nombre del empleado " + i + ":");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el número de días trabajados por " + nombre + ":");
            int diasTrabajados = scanner.nextInt();
            System.out.print("Ingrese el costo por día de trabajo de " + nombre + ":");
            double costoPorDia = scanner.nextDouble();
            double totalPagar = diasTrabajados * costoPorDia;
            System.out.printf("%-10s %-10s %-10s %-10s\n", "Nombre", "Días", "Costo/Día", "Total");
            System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", nombre, diasTrabajados, costoPorDia, totalPagar);
            System.out.println();

            scanner.nextLine();
        }

    }
}
/*
Ingrese el nombre del empleado 1:carlos
Ingrese el número de días trabajados por carlos:30
Ingrese el costo por día de trabajo de carlos:20
Nombre     Días       Costo/Día  Total     
carlos     30         20,00      600,00    

Ingrese el nombre del empleado 2:jose
Ingrese el número de días trabajados por jose:10
Ingrese el costo por día de trabajo de jose:10
Nombre     Días       Costo/Día  Total     
jose       10         10,00      100,00    

Ingrese el nombre del empleado 3:pedro
Ingrese el número de días trabajados por pedro:40
Ingrese el costo por día de trabajo de pedro:30
Nombre     Días       Costo/Día  Total     
pedro      40         30,00      1200,00   

Ingrese el nombre del empleado 4:lurdes
Ingrese el número de días trabajados por lurdes:15
Ingrese el costo por día de trabajo de lurdes:20
Nombre     Días       Costo/Día  Total     
lurdes     15         20,00      300,00    

Ingrese el nombre del empleado 5:ramiro
Ingrese el número de días trabajados por ramiro:100
Ingrese el costo por día de trabajo de ramiro:10
Nombre     Días       Costo/Día  Total     
ramiro     100        10,00      1000,00  
*/