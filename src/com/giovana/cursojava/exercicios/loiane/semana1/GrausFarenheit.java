package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class GrausFarenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a temperatura em graus Celsius: ");
        int graus = scan.nextInt();
        int grausCelsius =  graus * 9 / 5;
        int grausFare = grausCelsius + 32;
        System.out.println("a temperatura em graus Farenheit é: " + grausFare);
    }
}

//10.Faça   um   Programa   que   peça   a   temperatura   em   graus   Celsius,
//transforme e mostre em graus Farenheit. - COMPLETADO
