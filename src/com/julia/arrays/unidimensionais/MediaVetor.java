package com.julia.arrays.unidimensionais;

import java.util.Scanner;

public class MediaVetor {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("|  SISTEMA DE MÉDIA  |");

        float[] notas = new float[4];
        float somaNotas = 0;

        for(int i = 0; i < notas.length; i++){

            System.out.print("Informe a " + (i+1) + "ª nota: ");
            notas[i] = dados.nextFloat();

            somaNotas += notas[i];
        }

        float media = somaNotas/notas.length;
        System.out.println("---------------------------");
        System.out.println("Média do aluno(a): " + media);

        dados.close();
    }
}
