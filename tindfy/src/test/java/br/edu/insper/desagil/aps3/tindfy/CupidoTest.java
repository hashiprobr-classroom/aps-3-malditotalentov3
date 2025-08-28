package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CupidoTest {
    Cupido cupido;
    Usuario usuario1;
    Usuario usuario2;
    List <Musica> musicas;

    @BeforeEach
    void setup(){
        cupido = new Cupido();
        musicas = new ArrayList<>();
        usuario1 = new Usuario(1,"Pedro", musicas);
        usuario2 = new Usuario(2,"Enrico", musicas);
    }

    @Test
    void ninguemDaLike (){
        assertFalse(cupido.deuMatch(usuario1,usuario2));
    }

    @Test
    void primeiroDaLike(){
        cupido.daLike(usuario1.getIdentificador(),usuario2.getIdentificador());
        assertFalse(cupido.deuMatch(usuario1,usuario2));
    }

    @Test
    void segundoDaLike(){
        cupido.daLike(usuario2.getIdentificador(),usuario1.getIdentificador());
        assertFalse(cupido.deuMatch(usuario1,usuario2));
    }
}
