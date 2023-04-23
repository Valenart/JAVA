import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*
       SE A TEMPERATURA FOR MAIOR DO QUE 30 GRAUS, EXIBA UMA MENSAGEM DE AVISO.
        */
    
        //SCANNER
        Scanner sc = new Scanner(System.in);
        
        //VARIÁVEIS
        int temp = 0;
        
        System.out.println("Digite a temperatura: ");
        temp = sc.nextInt();
        if (temp <= 30) {
        System.out.println("Cuidado! a temperatura está baixa!");
    } else {
            System.out.println("Temperatura Ok!");
        }
         System.out.println("Obrigado por testar o código! =D");
  }
}
