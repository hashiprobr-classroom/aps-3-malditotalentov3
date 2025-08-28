package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    Artista artista;

    @BeforeEach
    void setup(){
        artista = new Artista(1, "Pedro");
    }

    @Test
    void constroi(){
        assertEquals(1,artista.getIdentificador());
        assertEquals("Pedro", artista.getNome());
    }

    @Test
    void mudaNome (){
        artista.setNome("Caio");
        assertEquals("Caio",artista.getNome());
    }
}
