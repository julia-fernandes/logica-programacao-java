package com.julia.arrays.multidimencionais;

import java.util.Scanner;

public class MatrizSomada {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        int soma = 0;
        for(int i = 0; i < matriz.length; i++){
            System.out.println((i + 1) + "° array:");

            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Elemento " + " [" + i + "] [" + j + "]: ");
                matriz[i][j] = dados.nextInt();

                soma += matriz[i][j];
            }
        }

        System.out.println("-------------------------");
        System.out.println("Soma dos elementos: " + soma);

        dados.close();
    }
}