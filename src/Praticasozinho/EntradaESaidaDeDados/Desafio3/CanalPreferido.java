package Praticasozinho.EntradaESaidaDeDados.Desafio3;

import java.io.Console;

class CanalPreferido {
    String nomeCanal;

    void confirmarCanalPreferido(){
        Console console = System.console();
        System.out.println("Qual seu canal preferido? ");
        this.nomeCanal = console.readLine();

        if ((this.nomeCanal.equalsIgnoreCase("Gutiloko"))) {
            System.out.println("\nBom gosto!");
        } else {
            System.out.println("\nLegal, mas gosto é gosto!");
        }

        //LEMBRANDO QUE ISSO NO INTELIJJ NÃO VAI RODAR MESMO
    }
}
