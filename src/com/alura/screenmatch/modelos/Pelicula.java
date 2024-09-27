package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion { /*con extends decimos que pelicula es hijo de Titulo y pasa a tener todos los mismo atributos y metodos
                                                                interfaces (interface y implements buscar)*/

   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClaificacion() {
        return (int) (calculaMedia()/2);/*como requiere un tipo de dato int nos sale error por la divicion pero de esta manera podemos hacer un cats
                                        de estamenra  (int) de esta manera convertimos el double en un entero*/
    }
}
