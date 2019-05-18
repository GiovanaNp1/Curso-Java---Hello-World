package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insirra dois numeros inteiros e 1 numero real: ");
        int numeroInt1 = scan.nextInt();
        int numeroInt2 = scan.nextInt();
        float numeroReal = scan.nextFloat();


        int primeirapartea = numeroInt1 * 2;
        int segundapartea = numeroInt2 / 2;
        float partea = primeirapartea * segundapartea;

        int prmeiraparteb = numeroInt1 * 3;
        float parteb =  primeirapartea + numeroReal;

        double partec = Math.pow(numeroReal,3);


        System.out.println(" o produto do dobro do primeiro com metade do segundo é: " + partea);
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + parteb);
        System.out.println("o terceiro elevado ao cubo é: " + partec);

    }
}

//11.Faça  um  Programa  que  peça  2  números  inteiros  e  um  número  real. 
//Calcule e mostre:
//a.o produto do dobro do primeiro com metade do segundo .
//b.a soma do triplo do primeiro com o terceiro.
//c.oterceiro elevado ao cubo. - COMPLETADO
