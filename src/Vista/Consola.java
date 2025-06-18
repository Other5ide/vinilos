package Vista;

import java.util.Scanner;

import Datos.Gestor;

/**
 * Clase responsable de interactuar con el usuario por consola.
 * Controla el menú principal y el flujo de login.
 */
public class Consola {
    static Scanner scanner = new Scanner(System.in);
    static Gestor gestor = new Gestor();

    /**
     * Controla el ciclo principal del menú del sistema.
     */
    public static void menu() {
        String opcion;

        do {
            mostrarOpciones();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);

        } while (!opcion.equals("2"));
    }

    /**
     * Muestra las opciones disponibles para el usuario.
     */
    private static void mostrarOpciones() {
        System.out.println("Consola:");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Agregar disco");
        System.out.println("2. Salir");
        System.out.println("3. Ver coleccion");
        System.out.println("4. Buscar disco");
        System.out.println("5. Ver cantidad de discos agregados");
        System.out.println("6. Ver espacios disponibles");
    }

    /**
     * Ejecuta la opción seleccionada por el usuario.
     *
     * @param opcion opción ingresada por el usuario
     */
    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1" -> gestor.agregarDisco();
            case "2" -> {
                System.out.println("Saliendo del Sistema...");
                scanner.close();
            }
            case "3" -> gestor.imprimirColeccion();
            case "4" -> gestor.buscarDisco();
            case "5" -> gestor.imprimirCantidadDiscosAgregados();
            case "6" -> gestor.obtenerEspaciosDisponibles();
            default -> System.out.println("Opcion invalida");
        }
    }
}