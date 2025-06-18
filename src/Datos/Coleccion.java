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


    public void imprimirNombreDiscos(){
        System.out.println("Tus discos ("+ listaDiscos.size() +"/100): ");
        for (int i = 0; i < listaDiscos.size(); i++) {
            System.out.println(listaDiscos.get(i).getTitulo());
            
        }
    }

    public boolean discoEstaEnLaLista(String nombreDisco){
        for (int i = 0; i < listaDiscos.size(); i++) {
            if (listaDiscos.get(i).getTitulo() == nombreDisco){
                return true;
            }
        }
        return false;
    }

    public boolean sobrepasaLimite() {
        return !(listaDiscos.size() <= 100);
    }

}
