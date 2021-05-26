package com.alura.logica.java;

/* Aula 3�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		// J� vimos como declarar numeros sem ( . ) ou ( , ). Agora vamos aprender outra
		// forma

		double novoSalarioMinimo;
		novoSalarioMinimo = 1.100;

		System.out.println("Come�a a valer neste dia 1� de janeiro/2021 o novo sal�rio m�nimo nacional que ser� de "
				+ novoSalarioMinimo);
		// Podemos observar que ele n�o imprime os zeros ( 0 ), mas para frente veremos
		// como arrumar isso.

		double salarioAmigo;
		double salarioAmiga;
		double mediaDoSalarioDosAmigos;

		salarioAmigo = 3.450;
		salarioAmiga = 5.570;
		mediaDoSalarioDosAmigos = (salarioAmigo + salarioAmiga) / 2;

		System.out.println("O sal�dio do meu amigo � " + salarioAmigo);
		System.out.println("O sal�rio da minha amiga � " + salarioAmiga);
		System.out.println("A m�dia dos sal�rios dos amigos � " + mediaDoSalarioDosAmigos);

		System.out.println("Com o novo sal�rio minimo o salario dos meus amigos subiu 1.000 reais olha quanto ficou");

		salarioAmigo = salarioAmigo + 1.000;
		salarioAmiga = salarioAmiga + 1.000;

		System.out.println("O novo sal�dio do meu amigo � " + salarioAmigo);
		System.out.println("O novo sal�rio da minha amiga � " + salarioAmiga);

		double novaMediaDeSalarios;

		novaMediaDeSalarios = (salarioAmigo + salarioAmiga) / 2;

		System.out.println("A nova media de sal�rios � " + novaMediaDeSalarios);
	}
}
