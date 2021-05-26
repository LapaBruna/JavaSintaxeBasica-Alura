package com.alura.logica.java;

/* Aula 4º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class TestaConversao {

	public static void main(String[] args) {

		double salario = 5.756;
		// int valor = salario; O compilador não permite e aponta o erro o correto é:

		int valor = (int) salario; // type casting - O cast de double (salario) para inteiro (valor)
		System.out.println("A VAR salario esta na VAR valor olha como ficou a conversão: ");
		System.out.println("salario: " + salario);
		System.out.println("valor: " + valor); // Atenção quando convertido perdemos os numero depois do ponto.

		float pontoFlutuante = 3.14f;
		// Adicionamos um F no final do número para evitar erros e ser interpretado como
		// Nº float.

		long numeroGrande = 32432423523L;
		// Adicionamos um L no final do número para evitar erros e ser interpretado como
		// Nº longo.

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
