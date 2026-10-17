package com.julia.condicionais.ifs;

/* Calcular valor ou insenção do imposto de renda sobre um salário.

 * Requisitos - objetivos, processos que precisam ser executados
 *   criar uma classe
 *   entrada de dados para o salário
 *   condicional
 *   definir porcentagem
 *   calcular porcentagem
 *   exibir resultado
 */

import java.util.Scanner;

public class ImpostoSalario {

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o salário R$: ");
        float salario = dados.nextFloat();

        float imposto;
        if(salario <= 2428.80f){
            System.out.println("ISENTO");
        }
        else if(salario <=  2826.65f){
            imposto = salario * 0.075f;
            System.out.printf("Tributação: R$ %.2f", imposto);
        }
        else if(salario <= 3751.05f){
            imposto = salario * 0.15f;
            System.out.printf("Tributação: R$%.2f", imposto);
        }
        else if(salario <= 4664.68){
            imposto = salario * 0.225f;
            System.out.printf("Tributação: R$ %.2f", imposto);
        }
        else{
            imposto = salario * 0.275f;
            System.out.printf("Tributação: R$ %.2f", imposto);
        }

        dados.close();
    }
}