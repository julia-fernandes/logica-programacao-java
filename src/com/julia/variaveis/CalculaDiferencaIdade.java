package com.julia.variaveis;

import java.util.Scanner;

public class CalculaDiferencaIdade {

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe uma idade: ");
        int primeiraIdade = dados.nextInt();

        System.out.print("Informe outra idade: ");
        int segundaIdade = dados.nextInt();

        int diferenca = primeiraIdade - segundaIdade;

        if(diferenca < 0){
            int diferencaPositiva = Math.abs(diferenca);
            System.out.println("A diferença entre as idades é de " + diferencaPositiva + "anos!" );
        }
        else{
            System.out.println("A diferença entre as idades é de " + diferenca + " anos!" );
        }
    }
}
