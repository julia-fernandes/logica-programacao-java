package com.julia.arrays.unidimensionais;

import java.util.Arrays;
import java.util.Scanner;

/*
* Armazenar em dois vetores 5 números e exibir o resultado da multiplicação entre eles
* em um terceiro vetor
* */

public class MultiplicaVetor {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];
        String multiplicacao = " ";

        for(int i = 0; i < vetor1.length ; i++){

            System.out.print("Posição " + i + " | Vetor1: ");
            vetor1[i] = dados.nextInt();

            System.out.print("Posição " + i + " | Vetor2: ");
            vetor2[i] = dados.nextInt();

            vetor3[i] = vetor1[i] * vetor2[i];
        }

        System.out.println("-------------------------------");
        System.out.print("Vetor 1: ");
        System.out.println(Arrays.toString(vetor1));

        System.out.print("Vetor 2: ");
        System.out.println(Arrays.toString(vetor2));

        System.out.println("-------------------------------");
        System.out.println("Multiplicação entre os valores:");
        System.out.println("         " + Arrays.toString(vetor3));

        dados.close();
    }
}