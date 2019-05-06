package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a sua altura?");
        float altura = scan.nextFloat();
        double Pesoidealp1 = altura*72.7;
        double pesoideal = Pesoidealp1 - 38;

        System.out.println("O peso ideal para a sua altura é: " + pesoideal);

    }
}
