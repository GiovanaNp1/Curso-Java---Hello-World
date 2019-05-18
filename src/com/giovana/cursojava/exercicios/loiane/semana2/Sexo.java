package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira aqui seu sexo: ");
		String genero = scan.next();
		
		if(genero.equalsIgnoreCase ("F")) {
			System.out.println("Seu sexo é Feminino");
		} else if (genero.equalsIgnoreCase("M")) {
			System.out.println("Seu sexo é Masculino");
		} else {
		    System.out.println("Sexo indefinido");
		}
		
	}

}


//3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. - COMPLETADO