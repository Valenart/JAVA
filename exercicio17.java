import java.util.Random;
import java.util.Scanner;

class Aplicacao {
    private Random random;

    public Aplicacao() {
        random = new Random();
    }

    public int rolarDado() {
        int valor = random.nextInt(6) + 1;
        return valor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aplicacao simulador = new Aplicacao();

        System.out.println("---------BEM VINDO---------");

        System.out.println("QUANTOS DADOS DESEJA ROLAR?");
        System.out.println("[1] 1 DADO");
        System.out.println("[2] 2 DADOS");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                int resultado1 = simulador.rolarDado();
                System.out.println("O VALOR SERÁ: " + resultado1);
                break;

            case 2:
                int resultado2a = simulador.rolarDado();
                int resultado2b = simulador.rolarDado();
                int soma = resultado2a + resultado2b;
                System.out.println("O VALOR DO PRIMEIRO DADO É: " + resultado2a);
                System.out.println("O VALOR DO SEGUNDO DADO É: " + resultado2b);
                System.out.println("A SOMA DO VALOR DOS DOIS DADOS É: " + soma);
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                break;
        }

        System.out.println("OBRIGADO POR TESTAR! =D");
        sc.close();
    }
}
