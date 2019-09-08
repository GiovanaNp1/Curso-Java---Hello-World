package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class Compras {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque os três produtos que você esta pensando em comprar: ");
        System.out.println("Produto 1: ");
        double produto1 = scan.nextDouble();
        System.out.println("Produto 2: ");
        double produto2 = scan.nextDouble();
        System.out.println("Produto 3: ");
        double produto3 = scan.nextDouble();

        if(produto1 < produto2 & produto1 < produto3){
            System.out.println("Recomendamos você comprar o Produto que custa " + produto1);
        }else if(produto2 < produto1 && produto2 < produto3){
            System.out.println("Recomednamos você comprar o Produto que custa " + produto2);
        } else{
            System.out.println("Recomendamos você comprar o Produto que custa " + produto3);
        }
    }
}

//    Faça  um  programa  que  pergunte  o  preço  de  três  produtos  e  informe qual  produto
//    você  deve  comprar,  sabendo  que  a  decisão  é  sempre pelo mais barato -- Concluido