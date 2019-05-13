package com.giovana.cursojava.exercicios.loiane.semana1;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Colque aqui os lado do quadrado para calcular a area do quadrado: ");
        int lados = scan.nextInt();
        int area = lados* lados;
        int dobro = area* 2;
        System.out.println("A area do quadrado e: " + dobro);
    }
}

//7.Faça  um  Programa  que  calcule  a  área  de  um  quadrado, 
//em  seguida mostre o dobro desta área para o usuário. - COMPLETADO


