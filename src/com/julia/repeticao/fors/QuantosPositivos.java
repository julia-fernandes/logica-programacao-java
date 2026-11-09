package com.julia.repeticao.fors;

import java.util.Scanner;
//recebe oito números e informa a quantidade de positivos, negativos e zeros digitados

public class QuantosPositivos {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Informe oito números");

        int negativos = 0;
        int positivos = 0;
        int zeros = 0;

        for(int i = 1; i <= 8; i++){

            System.out.print(i + "°: ");
            int numero = dados.nextInt();

            //cada n° digitado é comparado e atribuido a seu grupo
            if(numero < 0){
                negativos++;
            }
            else if(numero > 0){
                positivos++;
            }
            else{
                zeros++;
            }
        }

        System.out.println("Negativos: " + negativos);
        System.out.println("Positivos: " + positivos);
        System.out.println("Zeros: " + zeros);
    }
}