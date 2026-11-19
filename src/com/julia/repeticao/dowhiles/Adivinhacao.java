package com.julia.repeticao.dowhiles;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(1, 101);
        int numeroQuente = random.nextInt(10);
        int tentativa = -1;

        System.out.println("Adivinhe o número!");

        do{
            tentativa = dados.nextInt();

            if(tentativa == numero){
                System.out.println("Parabéns! Você acertou!");
                break;
            }
            else if(tentativa == (numero - numeroQuente) || tentativa == (numero + numeroQuente)){
                System.out.println("Passou perto!");
            }
            else{
                System.out.println("Dê um palpite melhor!");
            }

        }while(true);
        dados.close();
    }
}
