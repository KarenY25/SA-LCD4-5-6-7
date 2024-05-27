package com.multiplos;

import java.util.Scanner; //se importa la clase Scanner

public class Main {

	public static void main(String[] args) { // se agrega main
		 int[] n = new int[20]; //Declaramos e inicializamos un array de enteros con tamaño 20, agregamos new para inicializar correctamente el array

	        
	        for (int i = 0; i < 20; i++) { //agregamos un + para incrementar correctamente el índice
	            n[i] = (int) (Math.random() * 381) + 20;
	            System.out.print(n[i] + " "); //se corrige el método de impresión agregando out
	        }

	        Scanner scanner = new Scanner(System.in); //se utiliza scanner para leer la entrada del usuario en lugar de System.console().readLine()
	        System.out.println("\n¿Qué números quiere resaltar?");
	        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        int opcion = scanner.nextInt();

	        int multiplo = (opcion == 1) ? 5 : 7; //correción del operador, versión anterior ((opcion == 1) : 5 ? 7;)
	        
	        
	        for (int e : n) { //se cambia foreach por for para iterar el array de enteros
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] ");
	            } else {
	                System.out.print(e + " "); //se cambia in por out
	            }
	        }
	        
	        scanner.close(); // y se agrega close para cerrar el objeto Scanner
	    }
	}
