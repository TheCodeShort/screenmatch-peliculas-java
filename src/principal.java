public class principal {

    public static void main(String[] args) {
        pelicula miPelicula = new pelicula(); /*new crea una nueva instancia, crea un nuevo espacio par almacenar datos en esta caja */
        miPelicula.nombre = "Matrix";
        miPelicula.fechaDeLanzamiento = 1997;
        miPelicula. duracionNeMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println("sumatoria es:" + miPelicula.sumaDeLasEvaluaciones);
        System.out.println("total es: " + miPelicula.totalDeLasevaluaciones);
        System.out.println("la media es: " + miPelicula.calculaMedia());

        pelicula otraPelicula = new pelicula();
        otraPelicula.nombre = "el dia";
        otraPelicula.fechaDeLanzamiento = 2010;
        otraPelicula.duracionNeMinutos  = 120;

        otraPelicula.muestraFichaTecnica();/*con esto podemos evitar repetir codigo */




    }
}
