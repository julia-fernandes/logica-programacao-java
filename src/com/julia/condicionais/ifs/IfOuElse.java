package com.julia.condicionais.ifs;

public class IfOuElse {

    public static void main (String[] args){

        boolean condicao = false;

        if(condicao){
            System.out.println("Roda se a condição for verdadeira");
        }
        //não pode haver nada entre os dois
        else{
            System.out.println("Roda se a condição for falsa, ou contrária ao que o if espera");
            System.out.println("Nesse caso, if espera condição verdadeira enquanto o valor natural dela é falso");
        }

        if(condicao = true) {
            System.out.println("If executado porque o valor da variável mudou");
            System.out.println("Isso funciona porque no momento do if acontece uma nova atribuição que consequentemente\n" +
                    "sempre será verdadeiro");
        }

    }
}