package com.alura.screenmatch.Principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {

    public static void main(String[] args){

        Pelicula miPelicula = new Pelicula("Matrix", 1997); /*new crea una nueva instancia, crea un nuevo espacio para almacenar datos en esta caja */
                                                                                    /*estos dos parametros bienen de constructores por eso no se le hacer un setter*/
        miPelicula.evalua(8);

        Serie casaDragon = new Serie("La casa del dragon", 2022);/*nuevo objeto, /*esto es un constructor no es un metodo*/


        var peliculaDaBuno = new Pelicula("el señor de los anillos", 2001);/*por mas que diga var no se le puede cambiar el tipo de dato que tienes dentro*/
                                                                                                /*y si creamos un constructor para cambiar el nombre de la pelicula*/

        Pelicula otraPelicula = new Pelicula("avatar", 2023);


        ArrayList<Titulo> lista = new ArrayList<>();/*todo lo que colo que se coloqeu dentro del arary va a pertenecer a la clase Pelicula*/
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);/*aca podemos modificar el toString*/
        lista.add(peliculaDaBuno);



        for(Titulo item: lista) {/*esto es un foreach especial para listas*/
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClaificacion() > 2){/*con esto preguntamos si item es de tipo pelicula,
                                                    en java 14 apareciio una nueva forma de un casting y es ponerle una variable a pelicula y estamos  diciendo
                                                    si item es del tipo Pelicula, entonces que cree una variable de referencia llamada pelicula que sea del tipo Pelicula
                                                    tambien podemos usar operaciones*/

                /*Pelicula pelicula = (Pelicula) item;podemos usar el casting convertir un valor en otro que queramos es como formzarlo*/
                System.out.println(pelicula.getClaificacion());
            }
        }

    }
}