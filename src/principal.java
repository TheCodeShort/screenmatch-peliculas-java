public class principal {

    public static void main(String[] args) {
        pelicula miPelicula = new pelicula(); /*new crea una nueva instancia, crea un nuevo espacio par almacenar datos en esta caja */
        miPelicula.nombre = "Matrix";
        miPelicula.fechaDeLanzamiento = 1997;
        miPelicula. duracionNeMinutos = 120;
        System.out.println("mi peliculas es: " + miPelicula.nombre);
        System.out.println("fheca de lanzamiuento es:" + miPelicula.fechaDeLanzamiento);

        pelicula otraPelicula = new pelicula();
        otraPelicula.nombre = "el dia";
        otraPelicula.fechaDeLanzamiento = 2010;
        otraPelicula.duracionNeMinutos  = 120;

        System.out.println("mi peliculas es: " + otraPelicula.nombre);
        System.out.println("fheca de lanzamiuento es:" + otraPelicula.fechaDeLanzamiento);

    }
}
