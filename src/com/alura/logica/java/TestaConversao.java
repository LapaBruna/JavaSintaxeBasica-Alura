package com.alura.logica.java;

/* Aula 4�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class TestaConversao {

	public static void main(String[] args) {

		double salario = 5.756;
		// int valor = salario; O compilador n�o permite e aponta o erro o correto �:

		int valor = (int) salario; // type casting - O cast de double (salario) para inteiro (valor)
		System.out.println("A VAR salario esta na VAR valor olha como ficou a convers�o: ");
		System.out.println("salario: " + salario);
		System.out.println("valor: " + valor); // Aten��o quando convertido perdemos os numero depois do ponto.

		float pontoFlutuante = 3.14f;
		// Adicionamos um F no final do n�mero para evitar erros e ser interpretado como
		// N� float.

		long numeroGrande = 32432423523L;
		// Adicionamos um L no final do n�mero para evitar erros e ser interpretado como
		// N� longo.

		short valorPequeno = 2131;
		byte b = 127;
		System.out.println(pontoFlutuante);
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);

		// Problematica do DOUBLE:
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("Resultado de 0.2 + 0.1: " + total);
	}

	/*
	 *  VAR double - float: Numeros com ponto flutuante. 
	 * int - long - shor: Numeros curtos ou longos sem ponto.
	 */
}
