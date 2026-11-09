package com.julia.condicionais.ifs;
import java.util.Scanner;

//verificar se o número é positivo, negativo ou zero

public class PositivoNegativo {

    public static void main(String args[]){

        Scanner dados = new Scanner(System.in);

        System.out.println("|  VERIFICAR POSITIVO  |");
        System.out.print("Informe um número: ");
        int numero = dados.nextInt();

        if(numero > 0){
            System.out.println("Número positivo!");
        }
        else if(numero < 0){
            System.out.println("Número negativo!");
        }
        else{
            System.out.println("Número neutro.");
        }

        dados.close();
    }
}