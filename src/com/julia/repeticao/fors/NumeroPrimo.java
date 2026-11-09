package com.julia.repeticao.fors;

import java.util.Scanner;
//recebe um número e determina se ele é primo percorrendo seus divisores

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = dados.nextInt();

        if(numero <= 1){
            System.out.println("O número " + numero + " não é primo");
        }
        else {
            //assume de primeira que o número é primo, se não for altera o estado
            boolean primo = true;

            //for percorre todos os números até o informado e o divide por eles
            for (int i = 2; i < numero; i++) {

                if (numero % i == 0) {
                    System.out.println(numero + "/" + i + " = " + "não é primo");
                    primo = false;
                    break;
                    //se alguma divisão for exata o estado da variavel é alterado e o loop para
                }
            }

            if (primo) {
                System.out.println("O número " + numero + " é primo");
            } else {
                System.out.println("O número " + numero + " não é primo");
            }
        }
    }
}