package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Colque aqui os lado do quadrado para calcular a area do quadrado: ");
        int lados = scan.nextInt();
        int area = lados* 2 * 2;
        System.out.println("A area do quadrado é: " + area);
    }
}
