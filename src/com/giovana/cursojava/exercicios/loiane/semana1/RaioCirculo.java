package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class RaioCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o raio de seu circulo: ");
        double raio = scan.nextInt();
        double areaRaio = raio * 3.14;
        System.out.println("A area do seu circulo é: " + areaRaio );

    }
}
