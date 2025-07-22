package Praticasozinho.EntradaESaidaDeDados.Desafio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calcular = new Calculadora();

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        scanner.close();

        double soma = calcular.somar(num1, num2);
        double subtracao = calcular.subtrair(num1, num2);
        double multiplicacao = calcular.multiplicar(num1, num2);
        double divisao = calcular.dividir(num1, num2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
