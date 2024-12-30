package com.alura.screenmatch.calculos;

public interface Clasificacion  {

    int getClaificacion();
}

/*¿Por qué es así? Porque una interfaz establece un contrato, es decir, especifica qué métodos deben existir, pero no define
cómo deben funcionar. Esto le da a cada clase la libertad de implementar los métodos de la manera que necesite, adaptándolos
a su contexto específico*/

/*Sí, puedes crear muchas variables dentro de una interfaz, pero recuerda que todas serán automáticamente public static final (constantes).*/