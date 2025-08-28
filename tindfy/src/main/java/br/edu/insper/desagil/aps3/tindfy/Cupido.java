package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cupido {
    HashMap <Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    public void daLike(int deuLike, int recebeuLike){
        if (!likes.containsKey(deuLike)){
            List<Integer> listaLikes = new ArrayList<>();
            listaLikes.add(recebeuLike);
            likes.put(deuLike,listaLikes);
        } else {
            List<Integer> listaLikes = likes.get(deuLike);
            if (!listaLikes.contains(recebeuLike)) {
                listaLikes.add(recebeuLike);
            }
        }
    }

    public boolean deuMatch (Usuario usuario1, Usuario usuario2){

        List<Integer> likes1 = likes.get(usuario1.getIdentificador());
        List<Integer> likes2 = likes.get(usuario2.getIdentificador());

        Integer identificador1 = usuario1.getIdentificador();
        Integer identificador2 = usuario2.getIdentificador();

        if (likes1 == null || likes2 == null){
            return false;
        }
        if (likes1.contains(identificador2) && likes2.contains(identificador1)){
            return true;
        } else {
            return false;
        }
    }
}
