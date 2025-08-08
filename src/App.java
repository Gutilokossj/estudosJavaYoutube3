import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    //Acessando os argumentos, o valor do primeiro argumento é 
    //passado para a variável args[0]
      //System.out.println("Olá, " + args[0] + " " + args[1]);

      //Ele considera "Gustavo" como primeiro argumento, após espaço o segundo argumento
      //Ele roda com base no meu arquivo launch.json
      /*
       * Para vários argumentos isso não é muito legal, abaixo mostraremos o Scanner
       * 
       */

       Scanner scanner = new Scanner (System.in); //Usamos System.in para pegar o input do usuário
       System.out.println("Digite o seu nome: "); //Saída pro usuário que já conhecemos
       String name = scanner.nextLine(); //Chamamos o scanner e usamos o método nextLine que espera o usuário digitar e retorna a String digitada!
       System.out.println("Olá, " + name); //Saída de retorno pro usuário
       scanner.close(); //Precisa fechar o scanner após ler tudo, para não vazar dados.

       /*
        * O Scanner tem muitas outras funções, como nextInt, nextDouble, nextFloat, etc...
        Porém, temos outro "cara" que é específico para textos, Strings, o Console, mostrado abaixo:
        */

        Console console = System.console(); //Usamos System.console() para pegar o input do usuário
        System.out.println("Qual é o meu canal preferido?");
        String channelName = console.readLine(); //Chamamos o console e usamos o método readLine que espera o usuário digitar e retorna a String digitada!
        System.out.println(channelName + ", é claro!");

        //Basicamente faz a mesma coisa do Scanner mas usamos um objeto que é próprio pra trabalhar com textos
        
        //O Console só vai funcionar se comentarmos a parte do SCANNER acima
    }
}
