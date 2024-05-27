package com.models;

public class FizzBuzz {
	// Creando metodo imprimir:
		public void imprimir() {
			for (int i = 1; i <= 100; i++) {
				// Cuando es divisible entre 3 y 5 su modulo vale cero, entonces mostrar en consola FiZZbUZZ.
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
	}



