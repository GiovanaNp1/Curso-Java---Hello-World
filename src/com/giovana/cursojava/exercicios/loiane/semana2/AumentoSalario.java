package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque Seu salario para ver seu novo salario: ");
        float salario = scan.nextFloat();

        if (salario <= 280.00){
            System.out.println("Seu salario era de " + salario + " Agora sofreu aumento de " + salario * 1.2
                    +  " é teve o aumento de 20%");
        } else if (salario <= 700.00){
            System.out.println("Seu salario era de " + salario + " Agora sofreu aumento de " + salario * 1.15
                    +  " é teve o aumento de 15%");
        } else if (salario <= 1500.00){
            System.out.println("Seu salario era de " + salario + " Agora sofreu aumento de "
                    + salario * 1.1 +  " é teve o aumento de 10%");
        }else if (salario >= 1500.00){
            System.out.println("Seu salario era de " + salario + " Agora sofreu aumento de "
                    + ((salario * 0.05)+ salario) +  " é teve o aumento de 5%");
        } else{
            System.out.println("Valor invalio");
        }

    }
}

//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
// e lhe contraram para desenvolver o programa que calculará os reajustes.
//    - Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério,
//    baseado no salário atual:
//    - salários até R$ 280,00 (incluindo) : aumento de 20%
//    - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//    - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//    - salários  de  R$  1500,00  em  diante  :  aumento  de  5%
//    Após  o aumento ser realizado, informe na tela:
//    - o salário antes do reajuste;
//    - o percentual de aumento aplicado;
//    - o valor do aumento;oo novo salário, após o aumento. - CONCLUIDO
