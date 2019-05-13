package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira aqui seu sexo: ");
		String genero = scan.next();
		
		if(genero = "F") {
			System.out.println("Seu sexo é Feminino");
		} if else (genero = "M") {
			System.out.println("Seu sexo é Masculino");
		} else {
		    System.out.println("Sexo indefinido");
		}
		
	}

}
