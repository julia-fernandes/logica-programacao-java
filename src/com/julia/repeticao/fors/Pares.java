package com.julia.repeticao.fors;
//percorre os números de 1 a 100 e exibe apenas os pares

public class Pares {

    public static void main(String args[]) {

        //filtra um por um
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //percorre diretamente
        for (int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }

    }
}