package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class SalarioDesconto {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por mês?");
        double Salario = scan.nextInt();
        int percentualImposto = 100 / 11;
        double valorImposto = Salario - percentualImposto * Salario;

        System.out.println("o imposto descontado do seu salario é " + valorImposto);
    }
}
