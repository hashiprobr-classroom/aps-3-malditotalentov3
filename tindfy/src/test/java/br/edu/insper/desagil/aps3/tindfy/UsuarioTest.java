package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    Usuario usuario;
    List<Musica> musicas;
    Musica m1;
    Musica m2;
    Musica m3;
    Musica m4;

    @BeforeEach
    void setup(){
        musicas = new ArrayList<>();
        m1 = new Musica("A", new Artista(1,"B"));
        musicas.add(m1);
        m2 = new Musica("C", new Artista(2,"D"));
        musicas.add(m2);
        m3 = new Musica("E", new Artista(3,"F"));
        musicas.add(m3);
        usuario = new Usuario(1,"Pedro",musicas);
    }

    @Test
    void naoAdiciona(){
        usuario.adiciona(m1);
        assertEquals(3, usuario.getMusicas().size());
    }

    @Test
    void adiciona(){
        m4 = new Musica("G", new Artista(4,"H"));
        usuario.adiciona(m4);
        assertEquals(4, usuario.getMusicas().size());
    }
}
