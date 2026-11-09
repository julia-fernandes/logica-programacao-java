package com.julia.condicionais.ifs;

import java.util.Scanner;

public class VerificaTriangulo {

    public static void main(String args[]) {

        Scanner dados = new Scanner(System.in);

        System.out.println("|  VERIFICAÇÃO DE TRIÂNGULO  |");
        System.out.print("Informe o 1° lado: ");
        int ladoA = dados.nextInt();

        System.out.print("Informe o 2° lado: ");
        int ladoB = dados.nextInt();

        System.out.print("Informe o 3° lado: ");
        int ladoC = dados.nextInt();

        //se a resposta for sim ou não geralmente cabe em um boolean
        boolean triangulo = (ladoA + ladoB > ladoC && (ladoB + ladoC > ladoA) && ladoA + ladoC > ladoB);

        //primeiro verifica a existência do triângulo com a variável que guarda sua regra lógica
        if (!triangulo) {
            System.out.println("Triângulo inexistente.");
        }
        else if (ladoA == ladoB && (ladoB == ladoC)) {
            System.out.print("Triângulo Equilátrero!");
        }
        else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoC == ladoA)) {
            System.out.println("Triângulo Isóceles!");
        }
        else {
            System.out.println("Triângulo Escaleno!");
        }
    }
}