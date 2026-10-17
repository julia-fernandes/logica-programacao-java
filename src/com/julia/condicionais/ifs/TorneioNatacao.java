package com.julia.condicionais.ifs;

/* Como usuário, gostaria de ter nome e idade de participantes de um torneio de natação
 *  impressos da seguinte forma:
 *  < 10 anos = <nome> categoria infantil;
 *  entre 11 e 15 anos = <nome> categoria infantojuvenil;
 *  entre 16 e 19 anos = <nome> categoria juvenil;
 *  acima de 20 anos = <nome> categoria adulto;
 * */

import java.util.Scanner;

public class TorneioNatacao {

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);
        System.out.println("|  CLASSIFICAÇÃO DO TORNEIO DE NATAÇÃO  |");

        System.out.print("Participante: ");
        String nome = dados.nextLine();

        System.out.print("Idade: ");
        int idade = dados.nextInt();

        if(idade < 0){
            System.out.println("Idade inválida.");
        }
        else if(idade < 10){
            System.out.println(nome + " | Categoria INFANTIL");
        }
        else if(idade < 16){
            System.out.println(nome + " | Categoria INFANTOJUVENIL");
        }
        else if(idade < 20){
            System.out.println(nome + " | Categoria JUVENIL");
        }
        else{
            System.out.println(nome + " | Categoria ADULTO");
        }

        dados.close();
    }
}
