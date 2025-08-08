package Praticasozinho.EntradaESaidaDeDados.Desafio2;

import java.io.Console;

class CadastroPessoa {
    String nome;
    int idade;
    String cidade;


    void cadastrar (){
        Console console = System.console();
        System.out.println("Digite seu nome completo: ");
        this.nome = console.readLine();
        System.out.println("Digite sua idade: ");
        this.idade = Integer.parseInt(console.readLine()); //Convertendo, fazendo parsing String para valor inteiro
        System.out.println("Digite sua cidade: ");
        this.cidade = console.readLine();
    }

    void resumo(){
        System.out.println("Resumo dados cadastrados: \n Nome: " 
        + nome + "\n Idade: " + idade + "\n Cidade: " + cidade);
    }
}
