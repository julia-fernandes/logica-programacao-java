package com.julia.condicionais.ifs;

/* Se determinado salário for maior que 4500, imprima 30% do valor,
 *  senão, imprima 15%
 *  bônus: informar a porcentagem
 * */

import java.util.Scanner;

public class PorcentagemSalario {

    public static void main(String[] args){

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o salário: R$");
        float salario = dados.nextFloat();

        float resultado;
        String porcentagem = "";
        if(salario > 4500){
            resultado = salario * 0.3f;
            porcentagem = "30%";

//            System.out.print("30% do salário resulta em ");
//            System.out.printf("R$ %.2f", porcentagem);
//            //em printf não dá pra usar % além da formatação, por exemplo 30% não é válido
        }
        else{
            resultado = salario * 0.15f;
            porcentagem = "15%";
//            System.out.print("15% do salário resulta em ");
//            System.out.printf("R$ %.2f", porcentagem);
        }

        System.out.println(porcentagem + " do salário equivale a R$" + resultado);
        dados.close();
    }
}
