package br.edu.insper.desagil.aps3.tindfy;

public class Musica {
    Artista artista;
    String titulo;

    public Artista getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Musica(String titulo, Artista artista) {
        this.artista = artista;
        this.titulo = titulo;
    }
}
