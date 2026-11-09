package com.julia.repeticao.fors;

import java.util.Scanner;

//recebe 5 números e exibe o maior e menor entre eles
public class MaiorMenor {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int maiorNumero = dados.nextInt();
        int menorNumero = maiorNumero;
        //ambas variáveis iniciam com o mesmo valor para depois compararem com os próximos

        //o primeiro n° foi solicitado fora do for então agora 4 repetições bastam
        for(int i = 1; i < 5; i++){

            System.out.print("Informe um número: ");
            int numero = dados.nextInt();
            //variável para comparar com os valores iniciais e novos

            if(numero > maiorNumero){
                maiorNumero = numero;
            }

            if(numero < menorNumero){
                menorNumero = numero;
            }
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
    }
}