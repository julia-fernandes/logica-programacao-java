package com.julia.repeticao.dowhiles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        boolean variavel = true;
        int alternar;

        do{
            System.out.println("Estado da variável: " + variavel);
            System.out.print("Alternar estado? [1-SIM | 2-NÃO | 0-SAIR] ");
            alternar = dados.nextInt();

            if(alternar == 1){
                variavel = !variavel;
            }

        }while(alternar != 0);

        System.out.println("Fim da repetição");

        dados.close();
    }
}