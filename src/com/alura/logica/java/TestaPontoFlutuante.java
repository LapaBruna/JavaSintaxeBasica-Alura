package com.alura.logica.java;

/* Aula 3º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		// Já vimos como declarar numeros sem ( . ) ou ( , ). Agora vamos aprender outra
		// forma

		double novoSalarioMinimo;
		novoSalarioMinimo = 1.100;

		System.out.println("Começa a valer neste dia 1º de janeiro/2021 o novo salário mínimo nacional que será de "
				+ novoSalarioMinimo);
		// Podemos observar que ele não imprime os zeros ( 0 ), mas para frente veremos
		// como arrumar isso.

		double salarioAmigo;
		double salarioAmiga;
		double mediaDoSalarioDosAmigos;

		salarioAmigo = 3.450;
		salarioAmiga = 5.570;
		mediaDoSalarioDosAmigos = (salarioAmigo + salarioAmiga) / 2;

		System.out.println("O saládio do meu amigo é " + salarioAmigo);
		System.out.println("O salário da minha amiga é " + salarioAmiga);
		System.out.println("A média dos salários dos amigos é " + mediaDoSalarioDosAmigos);

		System.out.println("Com o novo salário minimo o salario dos meus amigos subiu 1.000 reais olha quanto ficou");

		salarioAmigo = salarioAmigo + 1.000;
		salarioAmiga = salarioAmiga + 1.000;

		System.out.println("O novo saládio do meu amigo é " + salarioAmigo);
		System.out.println("O novo salário da minha amiga é " + salarioAmiga);

		double novaMediaDeSalarios;

		novaMediaDeSalarios = (salarioAmigo + salarioAmiga) / 2;

		System.out.println("A nova media de salários é " + novaMediaDeSalarios);
	}
}
