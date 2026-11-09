package com.julia.repeticao.fors;

import java.util.Scanner;

//recebe um número e informa seu fatorial
public class Fatorial {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("|   FATORIAL   |");
        System.out.print("Informe um número: ");
        int numero = dados.nextInt();

        if(numero < 0){
            System.out.println("O número informado deve ser positivo ou zero!");
        }
        else{

            int fatorial = 1;
            for(int i = 1; i <= numero; i++){

                fatorial = fatorial * i;
            }
            System.out.println(numero + "!" + " = " + fatorial);
        }
    }
}