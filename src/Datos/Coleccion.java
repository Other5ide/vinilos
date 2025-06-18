package Datos;
import java.util.ArrayList;

import Modelo.Disco;

public class Coleccion {
    private ArrayList<Disco> listaDiscos = new ArrayList<Disco>();

    public Coleccion(){
    }


    public void agregarDiscoAColeccion(Disco disco) {
        if (sobrepasaLimite()) {
            System.out.println("No se puede agregar el disco: 'limite de 100 discos alcanzado'");
        } else if (nombreDiscoEstaEnLaLista(disco.getTitulo())) {
            System.out.println("No se puede agregar el disco: ya hay un disco con ese nombre");
        } else {
            listaDiscos.add(disco);
        }
    }

    public ArrayList<Disco> getListaDiscos() {
        return listaDiscos;
    }

    public int getListaDiscosSize() {
        return listaDiscos.size();
    }


    public void imprimirDatosDiscos(){
        System.out.println("Tus discos ("+ listaDiscos.size() +"/100): ");
        for (int i = 0; i < listaDiscos.size(); i++) {
            System.out.println("Titulo: " + listaDiscos.get(i).getTitulo()+ " | Artista: " +listaDiscos.get(i).getArtista()+" | Año de salida: "+listaDiscos.get(i).getReleaseYear());
            
        }
    }


    public boolean nombreDiscoEstaEnLaLista(String nombreDisco){
         for (Disco disco : listaDiscos) {
            if (disco.getTitulo().equalsIgnoreCase(nombreDisco)) {
                return true;
            }
        }
        return false;
    }

    public boolean sobrepasaLimite() {
        return !(listaDiscos.size() <= 100);
    }

}
