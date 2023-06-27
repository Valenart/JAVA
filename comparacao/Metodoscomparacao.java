package comparacao;
import java.util.Scanner;

public class Metodoscomparacao {

    public Metodoscomparacao() {
    }

    public static int TrianguloX() {
        int valorA = 0;
        int valorB = 0;
        int valorC = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual e o primeiro valor do triangulo X?");
        valorA = entrada.nextInt();
        System.out.println("Qual e o segundo valor do triangulo X?");
        valorB = entrada.nextInt();
        System.out.println("Qual e o terceiro valor do  triangulo X?");
        valorC = entrada.nextInt();

        int valorDivX = (valorA + valorB + valorC) / 2;
        return valorDivX;
    }

    public static int TrianguloY() {
        int valorA = 0;
        int valorB = 0;
        int valorC = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual e o primeiro valor do triangulo Y?");
        valorA = entrada.nextInt();
        System.out.println("Qual e o segundo valor do triangulo Y?");
        valorB = entrada.nextInt();
        System.out.println("Qual e o terceiro valor do  triangulo Y?");
        valorC = entrada.nextInt();

        int valorDivY = (valorA + valorB + valorC) / 2;
        return valorDivY;
    }

    public static void Comparador() {
        int trianguloX = TrianguloX();
        int trianguloY = TrianguloY();
        if (trianguloX > trianguloY) {
            System.out.println("O triangulo com maior area e: Triangulo X com " + trianguloX + "m");
            return;
        } else {
            System.out.println("O triangulo com maior area e: Triangulo Y com " + trianguloY + "m");
            return;
        }
    }
}
