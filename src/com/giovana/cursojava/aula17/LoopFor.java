package com.giovana.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args){

        for(int i = 0; i < 5; i++){
            System.out.println("i tem valor de " + i);
        }

        for(int i = 5; i > 0; i--){
            System.out.println("i tem valor de " + i);
        }

        for(int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j =" + j);
        }


        int count = 0;
        for( ; count > 5 ; ){
            System.out.println("count :" + count );
        count += 2;
        }

        int soma = 1;
        for(int i = 1; i < 5; soma =+ i++);
        System.out.println("Valor da some é " + soma);
    }
}