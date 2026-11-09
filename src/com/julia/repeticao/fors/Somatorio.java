package com.julia.repeticao.fors;

import java.util.Scanner;
//recebe um número e soma todos os números até ele

public class Somatorio {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        System.out.println("|   SOMATÓRIO   |");

        System.out.print("Informe um número: ");
        int numero = dados.nextInt();

        int soma = 0;
        for(int i = 1; i <= numero; i++){
            //for percorre do 1 até o número informado

            soma += i;

            //se estiver no último número o sinal de "+" é substituido por "="
            if(i == numero){
                System.out.print(i + " = ");
            }
            else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(soma);
    }
}