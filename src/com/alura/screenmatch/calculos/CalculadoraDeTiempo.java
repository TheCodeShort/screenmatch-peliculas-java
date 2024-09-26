package com.alura.screenmatch.calculos;

import com.alura.screenmatch.modelos.Pelicula;/*este import aparece por que en el void se pueso  un parametro llamado Pelicula que es la clase ya creada*/
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye (Titulo titulo){/*aca vamos a incluir las peliculas y series pero  vamos a calcular el tiempo en el que nos lleva verlas*/
        this.tiempoTotal += titulo.getDuracionEnMinutos();/*con this nos da referencia a que nos referimos a que vamos usar el metoso pero de la calse de calculadoraDeTiempo (esto es polimorfismo)*/
    }



    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
