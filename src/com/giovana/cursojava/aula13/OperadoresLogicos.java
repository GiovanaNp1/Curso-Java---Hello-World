package com.giovana.cursojava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args){

        int valor1 = 1;
        int valor2 = 2;

        Boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor 2 é 2 - resultado: " + resultado1);

        Boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

        Boolean falso = false;
        Boolean verdadeiro = true;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
    }
}
