package Datos;

import java.util.Scanner;

import Modelo.Disco;

public class Gestor {
    private final Coleccion coleccion;
    static Scanner scanner = new Scanner(System.in);

    public Gestor(){
        this.coleccion = new Coleccion();
    }

    public void agregarDisco() {
        System.out.println();
        System.out.println("Ingrese el titulo del disco: ");
        String usuarioTitulo = scanner.nextLine();
        System.out.println("Ingrese el artista del disco: ");
        String usuarioArtista = scanner.nextLine();
        int usuarioAño = 0;
        boolean añoValidoIngresado = false;

        while (!añoValidoIngresado){
            System.out.println("Ingrese el año de salida del disco");
            try {
            usuarioAño = scanner.nextInt();
            añoValidoIngresado = esAñoValido(usuarioAño);
        } catch (Exception e) {
            System.out.println("Año ingresado invalido");
        }
        

        }
        
        coleccion.agregarDiscoAColeccion(new Disco(usuarioArtista, usuarioTitulo, usuarioAño));
    }

    public boolean esAñoValido(int año) {
        if (año <= 0 || año > 2025){
            return false;
        } else {
            return true;
        }
    }

    public void imprimirColeccion(){
        coleccion.imprimirNombreDiscos();
    }

    public void imprimirCantidadDiscosAgregados() {
        System.out.println("Cantidad de discos en la coleccion: "+coleccion.getListaDiscosSize() + "/100");
    }

    public void buscarDisco(){
        System.out.println("El disco esta");
        String busquedaUsuario = scanner.nextLine();
        if (coleccion.discoEstaEnLaLista(busquedaUsuario)) {
            System.out.println("Disco: '"+busquedaUsuario+ "'' encontrado en la coleccion");
        } else {
            System.out.println("Disco '"+busquedaUsuario+ "'' no esta en la coleccion");
        }
    }

    
}
