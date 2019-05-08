package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class NotaZeroaDez{
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Qual foi a sua nota da prova: ")
        int nota = scan.nextInt();
        
        if (nota =< 10){
            System.out.println("Sua nota foi " + nota);
        } else {
            System.out.println("Numero invalido");
        }
    }
}