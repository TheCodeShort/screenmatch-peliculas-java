package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombres;
    private Serie serie;
    private int totalVisializaciones;

    public int getTotalVisializaciones() {
        return totalVisializaciones;
    }

    public void setTotalVisializaciones(int totalVisializaciones) {
        this.totalVisializaciones = totalVisializaciones;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClaificacion() {
        if (totalVisializaciones > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
