package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui em baixo 3 numeros para Saber qual é o maior numero: ");
        System.out.println("1º Numero");
        int Numb1 = scan.nextInt();
        System.out.println("2º Numero");
        int Numb2 = scan.nextInt();
        System.out.println("3º Numero");
        int Numb3 = scan.nextInt();

        if(Numb1 > Numb2 & Numb1 > Numb3){
            System.out.println("O numero " + Numb1 + " é o maior numero");
        }else if(Numb2 > Numb1 && Numb2 > Numb3){
            System.out.println("O numero " + Numb2 + " é o maior numero");
        } else{
            System.out.println("O numero " + Numb3 + " é o maior numero");
        }
    }
}

    //Faça um Programa que leia três números e mostre o maior deles. CONCLUIDO
