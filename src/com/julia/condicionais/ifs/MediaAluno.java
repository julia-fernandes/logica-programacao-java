package com.julia.condicionais.ifs;

/* Como professor, quero avaliar a situação de um aluno com base em suas notas e frequência:
*  Aprovado
*  Recuperação
*  Reprovado por nota
*  Reprovado por falta
*
*  Obs:
*  Se a frequência for menor que 75% o aluno será reprovado automaticamente;
*  Média maior ou igual a 7 será aprovado e menor entra em recuperação
* */

import java.util.Scanner;

public class MediaAluno {

    public static void main(String args[]){

        Scanner dados = new Scanner(System.in);

        System.out.println("|  SISTEMA DE NOTAS  |");

        System.out.print("Informe a 1ª nota: ");
        float nota1 = dados.nextFloat();

        System.out.print("Informe a 2ª nota: ");
        float nota2 = dados.nextFloat();

        System.out.print("Informe a frequência %: ");
        float frequencia = dados.nextFloat();

        float media = (nota1 + nota2)/2;

        if(frequencia < 75){
            System.out.println("REPROVADO POR BAIXA FREQUÊNCIA");
            //primeiro a condição que pode encerrar o if sem precisar de outro parâmetro
        }
        else if(media >= 7){
            System.out.println("APROVADO");
        }
        else if(media >= 5){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("REPROVADO");
        }

        dados.close();
    }
}