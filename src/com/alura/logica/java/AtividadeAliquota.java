package com.alura.logica.java;

/* Aula 10�: Java JRE e JDK
 * 
 * Primeiros passos no Eclipse - Primeiros conceitos no JAVA.
 * Anota��es no fim da p�gina. 
*/

public class AtividadeAliquota {

	public static void main(String[] args) {
		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota � de 7%");
			System.out.println("Voc� pode deduzir at� R$ 142");

		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 350");

		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("A sua aliquota � de 22.5%");
			System.out.println("Voc� pode deduzir at� R$ 636");
		}
	}
}

/*
 * ~~ switch como funciona ~~
 * 
 * switch (variavelASerTestada) {
 * 
 * case op��o1: comando(s) caso a op��o 1 tenha sido escolhida break;
 * 
 * case op��o2: comando(s) caso a op��o 2 tenha sido escolhida break;
 * 
 * case op��o3: comando(s) caso a op��o 3 tenha sido escolhida break;
 * 
 * default: comando(s) caso nenhuma das op��es anteriores tenha sido escolhida
 * 
 * }
 * 
 * break: ir� interromper a execu��o do caso que o cont�m. defaultse: se nenhuma
 * condi��o for aceita, o c�digo do default � que ser� executado.
 * 
 * Ent�o, o switch � uma solu��o para os ifs encadeados.
 * 
 */
