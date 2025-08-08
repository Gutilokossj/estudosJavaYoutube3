import java.util.Scanner;

public class EstruturasSelecao {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Bem-vindo ao canal da Giliana Bezerra! Temos as seguintes opções: ");
        System.out.println("1. Se inscrever no canal");
        System.out.println("2. Dar like no vídeo");
        System.out.println("3. Compartilhar com os amigos");
        System.out.println("4. Ativar as notificações");
        System.out.println("Digite a opção desejada: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.close();

        //Professora deu exemplos com if, else if, else e o Switch também, tudo comentado para anotações.

        // if (opcao == 1) {
        //     System.out.println("Obrigada por se inscrever!");
        // } else if (opcao == 2){
        //     System.out.println("Obrigada pelo like!");
        // } else if (opcao == 3){
        //     System.out.println("Obrigada por compartilhar!");
        // } else if (opcao == 4) {
        //     System.out.println("Obrigada por ativar as notificações!");
        // } else {
        //     System.out.println("Opção não suportada!");
        // }

        //Refatoramos o switch para não termos tanta repetição de System.out.println

        switch (opcao) {
            case 1: {
                System.out.println("Obrigada por se inscrever!");
                break;
            }
            case 2: {
                System.out.println("Obrigada pelo like!");
                break;
            }
            case 3: {
                System.out.println("Obrigada por compartilhar!");
                break;
            }
            case 4: {
                System.out.println("Obrigada por ativar as notificações!");
                break;
            }
            default: {
                System.out.println("Opção não suportada!");
                break;
            }
        }

        /*
         * Exemplo da professora de como fazer de forma resumida, mas parece que a versão do java
         * que estou usando não suporta, porém anotei mesmo assim!! testar o Intellij depois
         */

        // String mensagem = switch (opcao) {
        //     case 1 -> "Origada por se inscrever!";
        //     case 2 -> "Obrigada pelo like!";
        //     case 3 -> "Obrigada por compartilhar!";
        //     case 4 -> "Obrigad por ativar as notificações!";
        //     default -> "Opção não suportada!";
        // };
        // System.out.println(mensagem);
    }
}
