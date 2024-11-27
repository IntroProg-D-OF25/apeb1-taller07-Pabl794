/**
 *Generar una solución que permita ingresar jugadores de fútbol; por cada
 * jugador se debe solicitar:Nombre el jugadorPosición en el campo de juegoEdadEstaturaEl
 * ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte 
 * (usar una cadena de acumulación):
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Problema4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reporte = "Listado de Jugadores\n";
        int contadorJugadores = 0;
        double sumaEdades = 0;
        double sumaEstaturas = 0;

        boolean continuar = true;

        while (continuar) {
            contadorJugadores++;
            System.out.print("Ingrese el nombre del jugador " + contadorJugadores + ":");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la posición del jugador en el campo:");
            String posicion = scanner.nextLine();
            System.out.print("Ingrese la edad del jugador:");
            int edad = scanner.nextInt();
            System.out.print("Ingrese la estatura del jugador (en metros):");
            double estatura = scanner.nextDouble();
            reporte += contadorJugadores + ". " + nombre + " -" + posicion + "-, edad " + edad + ", estatura " + estatura + "\n";
            sumaEdades += edad;
            sumaEstaturas += estatura;
            scanner.nextLine();
            System.out.print("¿Desea ingresar otro jugador? (si/no):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
        double promedioEdades = sumaEdades / contadorJugadores;
        double promedioEstaturas = sumaEstaturas / contadorJugadores;
        reporte += "Promedio de edades: " + Math.round(promedioEdades * 10.0) / 10.0 + "\n";
        reporte += "Promedio de estaturas: " + Math.round(promedioEstaturas * 100.0) / 100.0 + "\n";
        System.out.println("\n" + reporte);
    }
}
/*
Ingrese el nombre del jugador 1:
messi
Ingrese la posición del jugador en el campo:
medio campista
Ingrese la edad del jugador:
34
Ingrese la estatura del jugador (en metros):
1,60
¿Desea ingresar otro jugador? (si/no):
si
Ingrese el nombre del jugador 2:
moises caisedo
Ingrese la posición del jugador en el campo:
delantero
Ingrese la edad del jugador:
25
Ingrese la estatura del jugador (en metros):
1,78
¿Desea ingresar otro jugador? (si/no):
no

Listado de Jugadores
1. messi -medio campista-, edad 34, estatura 1.6
2. moises caisedo -delantero-, edad 25, estatura 1.78
Promedio de edades: 29.5
Promedio de estaturas: 1.69
*/