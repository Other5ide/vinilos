package Modelo;

public class Disco {

    private String titulo;
    private String artista;
    private int releaseYear;

    public Disco(String titulo,String artista, int releaseYear) {
        this.releaseYear = releaseYear;
        this.artista = artista;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public int getReleaseYear(){
        return releaseYear;
    }



}
