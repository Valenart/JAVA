import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        /*
        SE O NÚMERO FOR POSITIVO, MULTIPLIQUE POR DOIS; CASO CONTRÁRIO, 
        DIVIDA POR DOIS.
        */
    
        //SCANNER
        Scanner sc = new Scanner(System.in);
        
        //VARIÁVEIS
        int num1 = 0;
        System.out.println("------------------- BEM VINDO -------------------");
        System.out.println("Quando o valor for negativo será dividido por 2 ");
        System.out.println("Quando o valor for positivo será multiplicado por 2");
        System.out.println("Digite um número: ");
        num1 = sc.nextInt();
        if (num1 < 0) {
            double valor = num1/2;
            System.out.println("número negativo! ");
            System.out.println(num1 + "/2 será " + valor);
        } else {
            int valor = num1*2;
            System.out.println("número positivo! ");
            System.out.println(num1 + "*2 será " + valor);
        }
         System.out.println("Obrigado por testar o código! =D");
  }
}
