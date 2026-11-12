package com.julia.arrays.multidimencionais;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizImpressa {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int[][] matriz = new int[2][5]; //dois arrays com 5 elementos cada

        for(int i = 0; i < matriz.length; i++){

            System.out.println((i + 1) + "° array!");
            for(int j = 0; j < matriz[i].length; j++){

                System.out.print("Posição " + " [" + i + "] [" + j + "]: ");
                matriz[i][j] = dados.nextInt();
            }
        }

        System.out.println("-----------------------");
        System.out.println("Array completo!");
        System.out.println(Arrays.deepToString(matriz));

        dados.close();
    }
}
