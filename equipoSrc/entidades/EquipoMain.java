package entidades;
import java.util.Scanner;

public class EquipoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del Equipo 1: ");
        String nombreEquipo1 = scanner.nextLine();

        System.out.print("Ingrese el nombre del Equipo 2: ");
        String nombreEquipo2 = scanner.nextLine();

        Equipo equipo1 = new Equipo(nombreEquipo1, 2, 4, 1, 3, 2, false);
        Equipo equipo2 = new Equipo(nombreEquipo2, 2, 4, 1, 3, 2, false);
        Equipo resultadoEquipo = new Equipo();

    int opcion;
        do {
            System.out.println("1- Jugar partido");
            System.out.println("0- Salir");

            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                	resultadoEquipo.jugarPartido(equipo1, equipo2);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
