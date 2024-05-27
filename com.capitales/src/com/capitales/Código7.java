package com.capitales;

import java.util.HashMap;  //se importa HashMap
import java.util.Scanner;  //se importa Scanner

public class Código7 {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in); // Se creó un objeto Scanner para leer la entrada del usuario
	        HashMap<String, String> capitales = new HashMap<>(); //se cambia de Byte a String para almacenar nombres de PyC

	        capitales.put("Canadá", "Ottawa");
	        capitales.put("Estados Unidos", "Washington DC");
	        capitales.put("México", "Ciudad de México"); //Se cambia la capital de DF a CDMX
	        capitales.put("Belice", "Belmopán");
	        capitales.put("Costa Rica", "San José");
	        capitales.put("El Salvador", "San Salvador"); // Se agrega la capital de El Salvador
	        capitales.put("Guatemala", "Ciudad de Guatemala");
	        capitales.put("Honduras", "Tegucigalpa");
	        capitales.put("Nicaragua", "Managua");
	        capitales.put("Panamá", "Panamá"); 

	        String pais; // Se declaró una variable para almacenar el nombre del país. Se cambia la C por país para mejorar la legibilidad 
	        do {
	            System.out.print("Escribe el nombre de un país y te diré su capital: ");
	            pais = s.nextLine(); //se implementa nextLine para leer la próxima línea de texto de la entrada y que lo devuelva como una cadena String

	            if (!pais.equalsIgnoreCase("salir")) { //se implementa un método string para comprar 
	                if (capitales.containsKey(pais)) {  //se cambia de "ca" a "capitales" para mejorar legibilidad.
	                    System.out.println("La capital de " + pais + " es " + capitales.get(pais)); //se concatena para mostrar todo en una misma línea y utilizamos el método get en lugar de put
	                } else {
	                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
	                    String capital = s.nextLine();
	                    capitales.put(pais, capital); // // Si la capital no estaba en el HashMap, se solicita al usuario que la ingrese y se agregue al HashMap
	                    System.out.println("Gracias por enseñarme nuevas capitales");
	                }
	            }
	        } while (!pais.equalsIgnoreCase("salir")); //el bucle se repite hasta que el usuario escribe "salir"
	        
	       s.close(); // Se cierra el objeto Scanner para liberar recursos
	    }
	}