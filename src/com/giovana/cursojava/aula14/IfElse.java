package com.giovana.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade");
        int valor = scan.nextInt();
       /* int idade = scan.nextInt();

        if(idade >= 18 ){
            System.out.println("Maior de idade");
        }

        System.out.println("Entre com sua idade: ");

        int idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade. ");
        } else {
            System.out.println("Você é menor de idade. ");
        }

        System.out.println("Entre com o valor do item: ");
        double valor = scan.nextDouble(); */

            if (valor <= 10) {
                System.out.println("está barato, compre");
            } else if (valor > 10 && valor < 15) {
                System.out.println("tente pedir um desconto");
            } else if (valor >= 15 && valor < 17) {
                System.out.println("Tente pesquisar um poco mais em outros locais");
            } else {
                System.out.println("Esta uito caro, não compre aqui, é furada");
            }
        }
    }
