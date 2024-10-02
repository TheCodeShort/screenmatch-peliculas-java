package com.alura.screenmatch.Principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;/*esto se genera automaticamente si se elimina nustras variables no se encontraran
                                                ya que movimos nuestros achivo a otra carpeta*/
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Matrix", 1997); /*new crea una nueva instancia, crea un nuevo espacio para almacenar datos en esta caja */
        /*estos dos parametros bienen de constructores por eso no se le hacer un setter*/

        miPelicula.setDuracionNeMinutos(120);/*al ser privado usamos un setter para poder cambiar el valor o si es un sting podemos cambiar lo que dice dentro*/
        miPelicula.setIncluidoEnELPlan(true);
        miPelicula.setDirector("El paco");
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.muestraFichaTecnica();
        System.out.println("la suma es: " + miPelicula.sumaEvaluaciones());
        System.out.println("total evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());/*con get podemos mostrar el valor pero cuando trate de modificar el valor no podra hacerlo*/
        System.out.println("la media es: " + miPelicula.calculaMedia());
        System.out.println("Director de la pelicula es: " + miPelicula.getDirector());

        Serie casaDragon = new Serie("La casa del dragon", 2022);/*nuevo objeto, /*esto es un constructor no es un metodo*/

        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println("***************************************************************");
        casaDragon.muestraFichaTecnica();
        System.out.println("cantidad de temporadas: " + casaDragon.getTemporadas());
        System.out.println("minutos por temporada: " + casaDragon.getMinutosPorEpisodio());
        System.out.println("minutos por episodio: " + casaDragon.getEpisodiosPorTemporada());

        Pelicula otraPelicula = new Pelicula("avatar", 2023);
        otraPelicula.setNombre("el oso");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionNeMinutos(188);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();/*esto es un constructor no es un metodo*/
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("*****************************************************************");
        System.out.println("Tiempo necesario para ver tus tutulos favoritos estas vacasiones: " + calculadora.getTiempoTotal());
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();/*esto es un constructor no es un metodo*/
        episodio.setNumero(1);
        episodio.setNombres("la casa de papel");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisializaciones(300);
        filtroRecomendacion.filtro(episodio);

        /*Pelicula peliculaDaBuno = new Pelicula(); esta estructur atambein se peude usasr o la de abajo */
        var peliculaDaBuno = new Pelicula("el señor de los anillos", 2001);/*por mas que diga var no se le puede cambiar el tipo de dato que tienes dentro*/
        /*y si creamos un constructor para cambiar el nombre de la pelicula*/

        peliculaDaBuno.setDuracionNeMinutos(180);
        peliculaDaBuno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listataDePeliculas = new ArrayList<>();/*todo lo que colo que se coloqeu dentro del arary va a pertenecer a la clase Pelicula*/
        listataDePeliculas.add(peliculaDaBuno);
        listataDePeliculas.add(miPelicula);

        System.out.println("********************************************************");
        System.out.println("Tamño de la lista: " + listataDePeliculas.size());/*al poner un punto en lla lista salen los metodos */
        System.out.println("La primera pelicula es: " + listataDePeliculas.get(0).getNombre());/*si ponemos en google javadoc  la vercion de java que estamos utilizando y ponemos ArrayList encontraremos informacion*/
        System.out.println("La lista de la pelicula: " + listataDePeliculas);

        System.out.println("El toString de la pelicula: " + listataDePeliculas.get(0).toString());


    }
}
