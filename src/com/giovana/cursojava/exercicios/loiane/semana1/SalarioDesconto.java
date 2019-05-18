package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class SalarioDesconto {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira aqui o quanto você ganha por hora: ");
        int ganhoHora = scan.nextInt();
        System.out.println("Insira aqui o quanto número de horas trabalhadas no mês:");
        int horaMes = scan.nextInt();
        
        int salarioBruto = ganhoHora * horaMes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;
        
        
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Imposto de Renda: " + ir);
        System.out.println("Salario liquido: " + salarioLiquido);
        
    }
}

//13.Faça  um  Programa  que  pergunte  quanto  você  ganha  por  hora  e  
//o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário 
//no referido mês, sabendo-se que são descontados 11% para o Imposto  de  Renda,  8% 
//para  o  INSS  e  5%  para  o  sindicato,  faça  um programa que nos dê:
//.saláriobruto.a.quanto pagou ao INSS.b.quanto pagou ao sindicato.
//c.o salário líquido.d.calcule  os  descontos  e  o  salário  líquido,  conforme  a  tabela abaixo:
//+  Salário  Bruto  :  R$ -IR  (11%)  :  R$ -INSS 
//(8%)  :  R$ -Sindicato  (  5%)  :  R$  =  Salário Liquido : R$ - CONCLUIDO
