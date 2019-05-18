package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Coloque aqui uma letra para saber se é uma vogal ou consoante");
		String letra = scan.next();
		
		/* if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
		} */
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":System.out.println("vogal"); break;
		default: System.out.println("consoante"); 
		}
	}
	
	

}

//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo - COPLETADO