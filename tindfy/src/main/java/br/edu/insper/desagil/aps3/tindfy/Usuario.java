package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa{
    List<Musica> musicas;

    public List<Musica> getMusicas() {
        return musicas;
    }

    public Usuario(int identificador, String nome, List<Musica> musicas) {
        super(identificador, nome);
        this.musicas = musicas;
    }

    public boolean jaAdicionou(Musica musica_recebida){
        int identificador_recebido = musica_recebida.getArtista().getIdentificador();
        String titulo_recebido = musica_recebida.getTitulo();
        for (Musica musica : musicas){
            int identificador = musica.getArtista().getIdentificador();
            String titulo = musica.getTitulo();
            if (identificador == identificador_recebido && titulo_recebido.equals(titulo)){
                return true;
            }
        }
        return false;
    }

    public void adiciona (Musica musica_recebida){
        if (!jaAdicionou(musica_recebida)){
            musicas.add(musica_recebida);
        }
    }
}
