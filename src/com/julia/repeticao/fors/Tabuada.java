package com.julia.repeticao.fors;

public class Tabuada {
    public static void main(String[] args) {

        System.out.println("|    TABUADA    |");

        for(int i = 1; i<=10; i++){

            for(int j = 1; j<=10; j++){ //for aninhado

                int multiplicacao = i * j;
                System.out.println(i + "x" + j + " = " + multiplicacao);
            }
            System.out.println();
        }
    }
}