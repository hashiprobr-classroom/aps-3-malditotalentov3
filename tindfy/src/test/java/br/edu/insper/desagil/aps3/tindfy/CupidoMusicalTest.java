package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CupidoMusicalTest {
    CupidoMusical cupidoMusical;
    Usuario usuario1;
    Usuario usuario2;
    List<Musica> musicas;
    Musica m1;
    Musica m2;
    Musica m3;
    Musica m4;

    @BeforeEach
    void setup(){
        cupidoMusical = new CupidoMusical();
        musicas = new ArrayList<>();
        usuario1 = new Usuario(1,"Pedro", musicas);
        usuario2 = new Usuario(2,"Enrico", musicas);
        m1 = new Musica("A", new Artista(1,"B"));
        m2 = new Musica("C", new Artista(2,"D"));
        m3 = new Musica("E", new Artista(3,"F"));
    }

    @Test
    void semLikesComMusicas(){
        usuario1.adiciona(m1);
        usuario2.adiciona(m1);
        assertFalse(cupidoMusical.deuMatch(usuario1,usuario2));
    }

    @Test
    void comLikesSemMusicas(){
        cupidoMusical.daLike(usuario1.getIdentificador(), usuario2.getIdentificador());
        cupidoMusical.daLike(usuario2.getIdentificador(), usuario1.getIdentificador());
        assertFalse(cupidoMusical.deuMatch(usuario1,usuario2));
    }

    @Test
    void comLikesComMusicas(){
        usuario1.adiciona(m1);
        usuario2.adiciona(m1);
        cupidoMusical.daLike(usuario1.getIdentificador(), usuario2.getIdentificador());
        cupidoMusical.daLike(usuario2.getIdentificador(), usuario1.getIdentificador());
        assertTrue(cupidoMusical.deuMatch(usuario1,usuario2));
    }
}
