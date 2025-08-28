package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class CupidoMusical extends Cupido{

    @Override
    public boolean deuMatch(Usuario usuario1, Usuario usuario2){
        if (super.deuMatch(usuario1,usuario2)){
            List <Musica> musicas1 = usuario1.getMusicas();

            for (Musica musica: musicas1) {
                if (usuario2.jaAdicionou(musica)) {
                    return true;
                }
            }
        }
        return false;
    }
}
