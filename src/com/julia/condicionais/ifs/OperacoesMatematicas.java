package com.julia.condicionais.ifs;

import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String args[]){

        Scanner dados = new Scanner(System.in);
        System.out.println("|  OPERAÇÕES BÁSICAS  |");

        System.out.print("Informe um número: ");
        int primeiroNumero = dados.nextInt();

        System.out.print("Informe outro número: ");
        int segundoNumero = dados.nextInt();

        int adicao = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;

        System.out.println("ADIÇÃO = " + adicao);
        System.out.println("SUBTRAÇÃO = " + subtracao);
        System.out.println("MULTIPLICAÇÃO = " + multiplicacao);

        int divisao = 0;
        if(segundoNumero == 0){
            System.out.println("Impossível dividir por zero");
        }
        else {
            divisao = primeiroNumero / segundoNumero;
            System.out.println("DIVISÃO = " + divisao);
        }

        dados.close();
    }
}