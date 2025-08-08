package Praticasozinho.IF_Else_Switch.Desafio1;

import java.util.Scanner;

public class CalculadoraSimples {
    double num1;
    double num2;


    void calcular(){
        Scanner scanner = new Scanner(System.in);
        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
        calculadoraSimples.mostrarMenu();
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Selecionada opção: Somar");
                System.out.println("Por favor, digite o primeiro número: \n");
                this.num1 = scanner.nextDouble();
                System.out.println("Por favor, digite o segundo número: \n");
                this.num2 = scanner.nextDouble();
                double resultado = this.num1 + this.num2;
                System.out.println("Muito bem, a soma dos números é: " + resultado);
                break;
            case 2:
                System.out.println("Selecionado a opção: Subtrair");
            default:
                break;
        }
    }

    void mostrarMenu(){
        System.out.println("\n 1. Somar \n 2. Subtrair \n 3. Multiplicar \n 4. Dividir");
    }
}
