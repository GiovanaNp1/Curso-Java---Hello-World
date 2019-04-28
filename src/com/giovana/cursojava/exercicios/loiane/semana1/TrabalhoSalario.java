package com.giovana.cursojava.exercicios.loiane.semana1;


import java.util.Scanner;

public class TrabalhoSalario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira aqui o quanto você ganha por hora: ");
        int ganhoHora = scan.nextInt();
        System.out.println("Insira aqui o quanto número de horas trabalhadas no mês:");
        int horaMes = scan.nextInt();
        int salario = ganhoHora * horaMes;
        System.out.println("Você ganha por mês: " + salario);
    }
}
