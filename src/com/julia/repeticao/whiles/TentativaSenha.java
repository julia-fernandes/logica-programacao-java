package com.julia.repeticao.whiles;

import java.util.Scanner;

public class TentativaSenha {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int senha = 1984;
        int contador = 1;

        System.out.println("***** INFORME A SENHA *****");
        int tentativa = dados.nextInt();
        dados.nextLine();

        while(contador < 5){

            if(tentativa == senha){
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            else{
                contador++;
                System.out.println("SENHA INCORRETA");
                System.out.println("TENTANTIVAS RESTANTES: " + (contador - 6));
                tentativa = dados.nextInt();
                dados.nextLine();
            }

            if(contador == 5){
                System.out.println("ACESSO BLOQUEADO");
                break;
            }
        }
        dados.close();
    }
}