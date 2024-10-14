package com.alura.screenmatch.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;/* permitir que una aplicación Java envíe y reciba solicitudes HTTP (tales como GET, POST, PUT, DELETE) a través de Internet o redes locales.*/
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
	public static void main(String[] args) throws IOException, InterruptedException {/*con esto ( throws IOException, InterruptedException) decimos que nos estamos desligando de responsabilidades*/

		Scanner lectura = new Scanner(System.in);
		System.out.println("escriba el nombre de la pelicula: ");
		var busqueda = lectura.nextLine();

		String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=290c0af4"; /*de esta manera personalizamos la busqueda*/

		/*documentacion de java se 17, httprequest (esto es una peticion a un servidor)*/
		HttpClient client = HttpClient.newHttpClient(); /*crea una nueva instancia  de HttpClient, que es parte de la biblioteca java.net.http. Este cliente se utilizará para enviar solicitudes HTTP.*/

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(direccion))/*aca se coloca la url con su API, la API en este caso se genero en POSTMAN */
				.build();/*al tener .build() estamos utilizando un constructor
							patron .build() una forma de construit algo y puede tener muchas cosas*/

		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());/*Si send nos arroja error si nos paramos ha podemos delegar ese error
																		BodyHandlers Es una clase que contiene varios métodos estáticos (como ofString(), ofByteArray(), etc.) que te ayudan a definir cómo manejar el cuerpo de la respuesta que recibes del servidor.*/
		System.out.println(response.body());
	}

}
