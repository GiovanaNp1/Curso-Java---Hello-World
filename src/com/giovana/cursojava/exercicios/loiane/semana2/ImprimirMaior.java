package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class ImprimirMaior {
    public static  void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("inseri aqui dois numeros: ");

        int numr1 = scan.nextInt();
        int numr2 = scan.nextInt();

        if (numr1 > numr2){
            System.out.println("O numero " + numr1 + " é maior");
        } else {
            System.out.println("o numero " + numr2 + " é maior");
        }
    }
}

//1.Faça um Programa que peça dois números e imprima o maior deles. - COMPLETE