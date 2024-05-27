package com.Afortunado;

import java.util.Scanner; //se importa Scanner

public class Main {

	public static void main(String[] args) {  //se agrega clase main
		Scanner sc = new Scanner(System.in); //se agrega sc y System.in 

        System.out.print("Introduzca un número: ");
        
        // Se cambio: ni por numero para mejorar legibilidad.
        String numeroStr = sc.nextLine(); 
        
        // Se cambio: En vez de asignar como int el valor ni que ingres el usuario, se realiza el cambio usando parseInt para pasat de String a Int.
        int numero = Integer.parseInt(numeroStr);

        // Se cambio: afo por cantidadAfortunados para legibilidad. Iniciar el conteo en cero para usar bucle while.
        int cantidadAfortunados = 0;
        int cantidadNoAfortunados = 0;
        
        while (numero > 0) {
        	// Omitir int porque ya se cambio el valor ingresdo por el usuario.
            int digito = numero % 10;
            
            // Quitar parentesis inecesarios.
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                cantidadAfortunados++;
            } else {
                cantidadNoAfortunados++;
            // Agregar corchete faltante.
            }
            numero /= 10;
        }

        if (cantidadAfortunados > cantidadNoAfortunados) {
            System.out.println("El número " + numeroStr + " es un número afortunado.");
        } else {
            System.out.println("El número " + numeroStr + " no es un número afortunado.");
        }

        // se agregar sc.close.
        sc.close();
	}
}

	
