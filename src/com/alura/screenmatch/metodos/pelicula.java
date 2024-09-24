package com.alura.screenmatch.metodos;

public class pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionNeMinutos;
    private boolean incluidoEnELPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasevaluaciones;/*aca como esta en private no se puede modificar el valor y saldra error pero si queremos obtener el
                                        resultado o dejarlo ver, usamos GET*/

    public int getTotalDeLasEvaluaciones(){/*metodo de encapsulacmiento*/
        return totalDeLasevaluaciones;
    }

    public void muestraFichaTecnica(){//nuevo metodo y para darle nombre a nueestros metodos se utilizan vervos en infinitivo o tambien imperativo
        /*el voy en como crear una funcion la podemos llena de datos tecnicos y la llamamos a otras clases */
        System.out.println("El nombre de la com.alura.screenmatch.metodos.pelicula es: " + nombre);
        System.out.println("fheca de lanzamiuento es:" + fechaDeLanzamiento);
        System.out.println("Duracion en minutos es:" + duracionNeMinutos);
    }


    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionNeMinutos() {
        return duracionNeMinutos;
    }

    public boolean isIncluidoEnELPlan() {
        return incluidoEnELPlan;
    }

    public void setNombre(String nombre) {/*este setNombre nos ayuda a que el usuario escriba el nombre
                                           pero en la variable nombre que se declara en la clase pricipal toca declararla como
                                            setNombre("aca va el estring");*/
        this.nombre = nombre;/*este this indica que se refiere al atributo de esta clase  */
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setIncluidoEnELPlan(boolean incluidoEnELPlan) {
        this.incluidoEnELPlan = incluidoEnELPlan;
    }

    public void setDuracionNeMinutos(int duracionNeMinutos) {
        this.duracionNeMinutos = duracionNeMinutos;
    }


    public void evalua(double nota){/*en este cado esta esperando un dato */
        /*sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota; de esta manera tambien se puede sumar*/

        sumaDeLasEvaluaciones += nota;/**/
        totalDeLasevaluaciones++;
    }

    public double calculaMedia(){/*aca se nececcita retornar o sino nos aroja error*/
        return sumaDeLasEvaluaciones / totalDeLasevaluaciones;
    }
}
