import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    // SCANNER
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int chute = 0;
    int numeroRandom = rand.nextInt(101);
    int palpite = 0;

    System.out.println("ACERTE O NUMERO QUE ESTOU PENSANDO DE 0 A 100!");
    do {
      System.out.println("Chute um numero: ");
      chute = sc.nextInt();

      if (chute >= 101 || chute < 0) {
        System.out.println("Chute dentro do alcance que citei!");
      }

      else if (chute > numeroRandom) {
        if (chute - numeroRandom <= 5) {
          System.out.println("Foi quase! Tente novamente!");
        } else {
          System.out.println("Chute mais baixo! Tente de novo: ");
        }
      } else if (numeroRandom > chute) {
        if (numeroRandom - chute <= 5) {
          System.out.println("Foi quase! Tente novamente!");
        } else {
          System.out.println("Chute mais alto! Tente de novo:");
        }
      }
      palpite++;
    } while (chute != numeroRandom);

    System.out.println("Parabéns, você acertou com " + palpite
        + " tentativas!");
  }
}
