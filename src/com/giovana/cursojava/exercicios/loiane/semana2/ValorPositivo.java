package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class ValorPositivo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Inseri aqui um numero: ");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("o numero é negativo");
		} else {
			System.out.println("o numero é positivo");
		}

	}

}

//2 - Faça  um Programa  que  peça  um  valor  e  mostre  na  tela  se  o  valor 
//é positivo ou negativo
