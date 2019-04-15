package com.giovana.cursojava.aula13;

public class CurtoCircuito {
    public static void main(String[] args){

        Boolean falso = false;
        Boolean verdadeiro = true;
        Boolean resultado1 = falso & verdadeiro;
        Boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
