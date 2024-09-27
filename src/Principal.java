import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;/*esto se genera automaticamente si se elimina nustras variables no se encontraran
                                                ya que movimos nuestros achivo a otra carpeta*/
import com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); /*new crea una nueva instancia, crea un nuevo espacio par almacenar datos en esta caja */
        miPelicula.setNombre("Matrix");/*al ser privado usamos un setter para poder cambiar el valor o si es un sting podemos cambiar l oque dice dentro*/
        miPelicula.setFechaDeLanzamiento(1997);
        miPelicula.setDuracionNeMinutos(120);
        miPelicula.setIncluidoEnELPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("total es: " + miPelicula.getTotalDeLasEvaluaciones());/*con get podemos mostrar el valor pero cuando trate de modificar el valor no podra hacerlo*/
        System.out.println("la media es: " + miPelicula.calculaMedia());


        Serie casaDragon = new Serie();/*nuevo objeto*/
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println("***************************************************************");
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("el oso");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionNeMinutos(188);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("*****************************************************************");
        System.out.println("Tiempo necesario para ver tus tutulos favoritos estas vacasiones: " + calculadora.getTiempoTotal());
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombres("la casa de papel");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisializaciones(300);

        filtroRecomendacion.filtro(episodio);


    }
}
