package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira aqui a nota do trabalho individual: ");
        int notaIndividual = scan.nextInt();
        System.out.println("Insira aqui a nota do trabalho em grupo: ");
        int notaGrupo = scan.nextInt();
        System.out.println("Insira aqui a sua nota da pesquisa: ");
        int notaPesquisa = scan.nextInt();
        System.out.println("Insira aqui a nota da prova: ");
        int notaProva = scan.nextInt();
        int notaTotal = notaIndividual + notaGrupo + notaPesquisa + notaProva;
        int notaFinal = notaTotal / 4;
        System.out.println("Sua nota final é: " + notaFinal);
    }
}
