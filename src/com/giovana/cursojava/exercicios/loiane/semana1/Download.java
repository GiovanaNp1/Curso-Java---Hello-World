package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class Download {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o tamanho do arquivo: ");
		double tamanho = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velocidade = scan.nextDouble();
		
		double tempo =  tamanho / velocidade;
		
		System.out.println("Tempo de Download é: " + tempo);
	}
	
}

//14.Faça um programa que peça o tamanho de um arquivo para download (em  MB) 
//e  a  velocidade  de  um  link  de  Internet  (em  Mbps),  calcule  e 
//informe o tempo aproximado de download do arquivo usando este link (em minutos). - CONCLUIDO
