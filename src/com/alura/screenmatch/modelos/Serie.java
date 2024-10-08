package com.alura.screenmatch.modelos;

public class Serie extends Titulo{/*extends me dice que serie es hija de Titulo y ereda todos los metodos y atrbutos de titulo*/
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override/*se puede borrar o puede que no este pero es mejor dejarlo o colocarlo ya que pueden hacer cambios
               indica que este metodo es una sobre escritura */
    public int getDuracionEnMinutos() {/* @Override esto nos indica que es una sobre escritura de metoso */
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;/*supper indica que retorna el metodo de de nustra super clase de la clases pricipal  */
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}
