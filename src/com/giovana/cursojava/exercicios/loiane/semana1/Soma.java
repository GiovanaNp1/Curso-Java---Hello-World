package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Por favor, insira dois numeros para serem somados:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma dos numeros é: " + resultado);
    }
}

//3- Faca um Programa que peça dois números e imprima a soma. - COMPLETO