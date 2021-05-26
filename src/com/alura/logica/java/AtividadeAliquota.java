package com.alura.logica.java;

/* Aula 10º: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anotações no fim da página. 
*/

public class AtividadeAliquota {

	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota é de 7%");
			System.out.println("Você pode deduzir até R$ 142");

		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");

		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("A sua aliquota é de 22.5%");
			System.out.println("Você pode deduzir até R$ 636");
		}
	}
}

/*
 * ~~ switch como funciona ~~
 * 
 * switch (variavelASerTestada) {
 * 
 * case opção1: comando(s) caso a opção 1 tenha sido escolhida break;
 * 
 * case opção2: comando(s) caso a opção 2 tenha sido escolhida break;
 * 
 * case opção3: comando(s) caso a opção 3 tenha sido escolhida break;
 * 
 * default: comando(s) caso nenhuma das opções anteriores tenha sido escolhida
 * 
 * }
 * 
 * break: irá interromper a execução do caso que o contém. defaultse: se nenhuma
 * condição for aceita, o código do default é que será executado.
 * 
 * Então, o switch é uma solução para os ifs encadeados.
 * 
 */
