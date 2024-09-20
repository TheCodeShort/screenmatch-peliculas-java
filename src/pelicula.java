public class pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionNeMinutos;
    boolean incluidoEnELPlan;
    double sumaDeLasEvaluaciones;
    int totalDeLasevaluaciones;
    void muestraFichaTecnica(){//nuevo metodo y para darle nombre a nueestros metodos se utilizan vervos en infinitivo o tambien imperativo
        /*el voy en como crear una funcion la podemos llena de datos tecnicos y la llamamos a otras clases */
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("fheca de lanzamiuento es:" + fechaDeLanzamiento);
        System.out.println("Duracion en minutos es:" + duracionNeMinutos);
    }

    void evalua(double nota){/*en este cado esta esperando un dato */
        /*sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota; de esta manera tambien se puede sumar*/

        sumaDeLasEvaluaciones += nota;/**/
        totalDeLasevaluaciones++;
    }

    double calculaMedia(){/*aca se nececcita retornar o sino nos aroja error*/
        return sumaDeLasEvaluaciones / totalDeLasevaluaciones;
    }
}
