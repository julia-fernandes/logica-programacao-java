package com.julia.condicionais.ifs;

/* Como gestor do sistema,
 *  gostaria de permitir que o próprio usuário cadastre seu login, sendo o nome de usuário,
 *  para agilizar o processo de migração de sistemas
 *
 *  Obs:
 *  O login não pode ser vazio, nem "admin" ou "administrador";
 *  Mensagem de erro para dados inválidos;
 *  Mensagem de sucesso para dados válidos
 **/

import java.util.Scanner;

public class  CadastroUsuario {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("|  SISTEMA DE LOGIN  |");

        System.out.print("Nome de usuário: ");
        String nome = dados.nextLine();

        System.out.print("Senha: ");
        String senha = dados.nextLine();

        if(nome.isEmpty() || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Login inválido");
        }
        else {
            System.out.println("Cadastro efetuado com sucesso!");
        }
        dados.close();
    }
}