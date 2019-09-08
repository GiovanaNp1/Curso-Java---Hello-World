package com.giovana.cursojava.exercicios.loiane.semana2;

import java.util.Scanner;

public class Horario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Em  que  turno  você estuda");
        System.out.println("Opções: M-matutino ,  V-Vespertino  ou  N-Noturno");
        String turno = scan.next();

        if (turno.equalsIgnoreCase ("M") || turno.equalsIgnoreCase ("matutino")){
            System.out.println("Bom   Dia!");
        }else if (turno.equalsIgnoreCase ("V") || turno.equalsIgnoreCase ("Vespertino")){
            System.out.println("Boa   Tarde!");
        } else if (turno.equalsIgnoreCase ("N") || turno.equalsIgnoreCase ("Noturno")){
            System.out.println("Boa   Noite!");
        } else {
           System.out.println("Valor Inválido!");
        }
    }
}

//    Faça  um  Programa  que  pergunte  em  que  turno  você estuda.
//    Peça para  digitar  M-matutino  ou  V-Vespertino  ou  N-Noturno.
//    Imprima  a mensagem   "Bom   Dia!",   "Boa   Tarde!"   ou   "Boa   Noite!"
//    ou   "Valor Inválido!", conforme o caso. -- COMPLETO