package com.alura.logica.java;

/* Aula 11º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaWhile {

	public static void main(String[] args) {

		int contador = 0;

		int contadorIdade = 0;
		int idade = 31;
		int novaIdade;

		int cont = 0;
		int numero = 0;

		while (contador <= 10) {

			System.out.println("Contador vale: " + contador);

			contador++;

			// contador = contador + 1;
			// contador += 1;

		}

		System.out.println("Estamos fora do while, contador vale: " + contador);

		while (contadorIdade <= 3) {

			novaIdade = idade + contadorIdade;
			contadorIdade++;

			System.out.println("Minha idade agora é: " + novaIdade);
		}

		while (cont <= 10) {

			numero = numero + cont;
			System.out.println("Número vale: " + numero);
			cont++;

		}

		System.out.println("Número vale: " + numero);

		int contador2 = 0;
		int total = 0;

		while (contador2 <= 10) {
			total += contador2;
			System.out.println("Total 1 : " + total);
			contador2++;
		}

		System.out.println("Total 2 : " + total);
	}
}

//O while aceita receber dois valores, true e false. O valor true mantém o loop em execução, já o false o finaliza. 
