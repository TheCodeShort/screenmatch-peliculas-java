package com.alura.screenmatch.modelos;

import com.alura.screenmatch.excepcion.ErrorEnConvericonDeException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{/*aca vamos a comparar dos objetos que sena de Titulo */

        @SerializedName("Title")/*esta anotacion con su parametro en string se debe a que el formato json de la API al imprimirla aparece la informacion y hay aparece Title*/
        private String nombre;/*esto es un atributo*/
        @SerializedName("Year")/*te permite mapear los nombres de los campos en el JSON con los nombres de los atributos en tu objeto Java.*/
        private int fechaDeLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnELPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDeLasevaluaciones;/*aca como esta en private no se puede modificar el valor y saldra error pero si queremos obtener el
                                            resultado o dejarlo ver, usamos GET*/


    public Titulo(String nombre, int fechaDeLanzamiento) { /*construcotor*/
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.Title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.Year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.Runtime().substring(0,3).replace("",""));
        if(miTituloOmdb.Runtime().contains("N/A")){
            throw new ErrorEnConvericonDeException("no puede convertir la duracion," + "porque contiene un N/A");

        }

    }

    public int getTotalDeLasEvaluaciones(){/*metodo de encapsulacmiento*/
            return totalDeLasevaluaciones;
        }

        public void muestraFichaTecnica(){//nuevo metodo y para darle nombre a nueestros metodos se utilizan vervos en infinitivo o tambien imperativo
                                            /*el void en como crear una funcion la podemos llena de datos tecnicos y la llamamos a otras clases */
            System.out.println("El nombre de la pelicula es: " + nombre);
            System.out.println("fheca de lanzamiuento es: " + fechaDeLanzamiento);
            System.out.println("Duracion en minutos es: " + getDuracionEnMinutos());

        }


        public String getNombre() {
            return nombre;
        }

         public void setNombre(String nombre) {/*este setNombre nos ayuda a que el usuario escriba el nombre
                                           pero en la variable nombre que se declara en la clase pricipal toca declararla como
                                            setNombre("aca va el estring");*/
            this.nombre = nombre;/*este this indica que se refiere al atributo de esta clase y el parametro es el valor qeu el usuario va a digitar */
    }

        public int getFechaDeLanzamiento() {
            return fechaDeLanzamiento;
        }

        public int getDuracionEnMinutos() { /*aca se necesita hacer un return en el void no se necesita hacer lo  ya que el mismo lo hace
                                             en este caso si se necesita hacer un raturn o si no harroja errror*/
            return duracionEnMinutos;
        }

        public boolean isIncluidoEnELPlan() {
            return incluidoEnELPlan;
        }


        public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

        public void setIncluidoEnELPlan(boolean incluidoEnELPlan) {
            this.incluidoEnELPlan = incluidoEnELPlan;
        }

        public void setDuracionNeMinutos(int duracionNeMinutos) {
            this.duracionEnMinutos = duracionNeMinutos;
        }


        public void evalua(double nota){/*en este caso esta esperando un dato */
                                        /*sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota; de esta manera tambien se puede sumar*/

            sumaDeLasEvaluaciones += nota;
            totalDeLasevaluaciones++;
        }

        public double sumaEvaluaciones(){
            return sumaDeLasEvaluaciones;
        }

        public double calculaMedia(){/*aca se nececcita retornar o sino nos aroja error*/
            return sumaDeLasEvaluaciones / totalDeLasevaluaciones;
        }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion=" + duracionEnMinutos;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {/*comparar por nombre*/
        return this.getNombre().compareTo(otroTitulo.getNombre());/*comparar el nombre del primer objeto con el que esta en el CompareTo()*/



    }
}
