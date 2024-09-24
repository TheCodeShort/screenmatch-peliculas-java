import com.alura.screenmatch.metodos.pelicula;/*esto se genera automaticamente si se elimina nustras variables no se encontraran
                                                ya que movimos nuestros achivo a otra carpeta*/

public class principal {

    public static void main(String[] args) {
        pelicula miPelicula = new pelicula(); /*new crea una nueva instancia, crea un nuevo espacio par almacenar datos en esta caja */
        miPelicula.setNombre("Matrix");/*al ser privado usamos un setter para poder cambiar el valor o si es un sting podemos cambiar l oque dice dentro*/
        miPelicula.setFechaDeLanzamiento(1997);
        miPelicula.setDuracionNeMinutos(120);
        miPelicula.setIncluidoEnELPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("total es: " + miPelicula.getTotalDeLasEvaluaciones());/*con get podemos mostrar el valor pero cuando trate de modificar el valor no podra hacerlo*/
        System.out.println("la media es: " + miPelicula.calculaMedia());






    }
}
