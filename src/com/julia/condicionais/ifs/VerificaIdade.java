package com.julia.condicionais.ifs;

import java.util.Scanner;

public class VerificaIdade {

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = dados.nextInt();

        if(idade >= 18){
            System.out.println("AUTORIZADO");
        }
        else{
            System.out.println("NÃO AUTORIZADO");
        }
        dados.close();
    }
}