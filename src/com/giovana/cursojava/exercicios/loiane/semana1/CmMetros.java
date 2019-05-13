package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class CmMetros {
            public static void main(String[] args){
            Scanner scan = new Scanner (System.in);

            System.out.println("Insira aqui sua altura? ");
            double centimetros =  scan.nextDouble();
            double resultado = centimetros * 100;

            System.out.print("o numero da altura  é " + resultado);
            System.out.println(" em centimetros");
    }
}

//5.Faça um Programa que converta metros para centímetros. - COMPLETADO