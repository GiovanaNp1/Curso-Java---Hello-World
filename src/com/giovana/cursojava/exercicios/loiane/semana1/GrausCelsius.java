package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class GrausCelsius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a temperatura em graus Farenheit: ");
        int graus = scan.nextInt();
        int grausFare =  graus - 32;
        int grausCelsius = 5 * grausFare / 9;
        System.out.println("a temperatura em graus Celsius é: " + grausCelsius);
    }
}
//9.Faça  um  Programa  que  peça  a  temperatura  em  graus  
//Farenheit, transforme e mostre a temperatura em graus Celsius.oC = (5 * (F-32) / 9). - COMPLETADO
