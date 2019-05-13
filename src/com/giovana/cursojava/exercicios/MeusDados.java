package com.giovana.cursojava.exercicios;

import java.util.Scanner;

public class MeusDados {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas informações");
        System.out.println("Digite seu nome aqui:");
        String primeiroNome = scan.nextLine();
        System.out.println("Digite sua idade aqui:");
        int idade = scan.nextInt();
        System.out.println("Digite sua altura aqui:");
        double altura = scan.nextDouble();
        System.out.println("Você gosta de Java:");
        boolean java = scan.nextBoolean();
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome:" + primeiroNome);
        System.out.println("Idade:" +idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gosta de Java: " + java);
    }
}

