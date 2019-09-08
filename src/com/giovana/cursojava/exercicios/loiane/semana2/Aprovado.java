package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class Aprovado {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite aqui a sua nota 1 (Numero de 0 a 10)");
        double nota1 = scan.nextInt();
        if (nota1 > 10 || nota1 < 0){
            System.out.println("Nota invalida");
        }
        System.out.println("Digite aqui a sua nota 2 (Numero de 0 a 10)");
        double nota2 = scan.nextInt();
        if (nota2 > 10 || nota2 < 0){
            System.out.println("Nota invalida");
        }
        int notaFinal = (int) (nota1 + nota2) /2 ;
        if (notaFinal == 10){
            System.out.println("Aprovado com Distinção");
        }else if (notaFinal >=  7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

// Faça um programa para a leitura de duas notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e apresentar:
//  - A  mensagem  "Aprovado",  se  a  média  alcançada  for  maior  ou igual a sete;
//  - A mensagem "Reprovado", se a média for menor do que sete;
//  - A mensagem "Aprovado com Distinção", se a média for igual a dez.
// Completo
