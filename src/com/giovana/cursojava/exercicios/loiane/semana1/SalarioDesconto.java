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

//13.Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  
//o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário 
//no referido mês, sabendo-se que são descontados 11% para o Imposto  de  Renda,  8% 
//para  o  INSS  e  5%  para  o  sindicato,  faça  um programa que nos dê:
//.saláriobruto.a.quanto pagou ao INSS.b.quanto pagou ao sindicato.
//c.o salário líquido.d.calcule  os  descontos  e  o  salário  líquido,  conforme  a  tabela abaixo:
//+  Salário  Bruto  :  R$ -IR  (11%)  :  R$ -INSS 
//(8%)  :  R$ -Sindicato  (  5%)  :  R$  =  Salário Liquido : R$
