package com.julia.variaveis;

/* Calcular as seguintes porcentagens de um salário, reutilizando a variável:
 *  30%, 15% e 5%
 */

import java.util.Scanner;

public class ReutilizaVariavel{

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o salário: R$");
        float salario = dados.nextFloat();

        float porcentagem = salario * 0.3f;
        System.out.println("30% do salário: " + porcentagem);

        porcentagem = salario * 0.15f;
        System.out.println("15% do salário: " + porcentagem);

        porcentagem = salario * 0.05f;
        System.out.println("5% do salário: " + porcentagem);


        dados.close();
    }
}