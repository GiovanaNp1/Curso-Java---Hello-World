package com.giovana.cursojava.exercicios;

public class TrabalhoMaria {
    public static void main(String[] args){
        int salario = 2500;
        int horasSemana = 40;
        int horasMes = salario / 40 ;
        int horasSemanal = horasMes * 5;

        System.out.println("O valor da hora de trabalho de Maria é:" + horasMes);
        System.out.println("O valor da semana do trabalho de Maria é:" + horasSemanal);
    }
}
