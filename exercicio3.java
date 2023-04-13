import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    /*
    FAÇA UM PROGRMA QUE ELE LEIA O SALÁRIO DE UM TRABALHADOR E QUE FAÇA O 
    REAJUSTE DELE EM 5%
    */
    
    // SCANNER
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual é o seu salário no momento? ");
    int salario = sc.nextInt();

    double salarioAjuste = (int) ((salario * 0.05) + salario);
    System.out.println("O seu salário com ajuste de 5% será: R$" + salarioAjuste);
  }
}
