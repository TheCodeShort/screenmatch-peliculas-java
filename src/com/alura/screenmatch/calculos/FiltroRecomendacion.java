package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtro(Clasificacion clasificacion){
        if (clasificacion.getClaificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClaificacion() >= 2) {
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Colocalo a tu lista para verlo despues");
        }

    }
}
