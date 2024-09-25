package com.alura.screenmatch.modelos;

public class Pelicula extends Titulo{ /*con extends decimos que pelicula es hijo de Titulo y pasa a tener todos los mismo atributos y metodos*/

   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
