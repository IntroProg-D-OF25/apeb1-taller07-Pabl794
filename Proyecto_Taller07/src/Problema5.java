/**
 *Generar un programa Java que permita ingresar 4 estudiantes;
 * por cada uno de ellos ingresar el nombre del estudiante,
 * el promedio de ciclo. Presentar el siguiente reporte
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nomEst, estado;
        double promedio, cont=1;
        while(cont<=4){
            System.out.print("Dame nombre y promedio: ");
            nomEst = tcl.next();
            promedio = tcl.nextDouble();
            if(promedio>=7)
                estado = "aprobado";
            else
                estado = "reprobado";
            System.out.println("NOMBRE \t PROMEDIO \t  ESTADO");
            System.out.println(nomEst + " \t " + promedio + " \t\t " + estado);
            cont++;
     }
    }
}
/*
Dame nombre y promedio: pablo 5
NOMBRE 	 PROMEDIO 	  ESTADO
pablo 	 5.0 		 reprobado
Dame nombre y promedio: alejandro 10
NOMBRE 	 PROMEDIO 	  ESTADO
alejandro 	 10.0 		 aprobado
*/


