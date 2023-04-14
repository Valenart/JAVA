import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  /*
   CRIE UM PROGRAMA ONDE O USUÁRIO DIGITARÁ 2 NÚMEROS E ESCOLHA
   POR UM MENU SE IRÁ SOMAR/SUBTRAIR/MULTIPLICAR OU DIVIDIR OS 
   NÚMEROS DIGITADOS.
   
  */ 

    //SCANNER
    Scanner sc = new Scanner(System.in); 
    
    double num1 = 0;
    double num2 = 0;
    int escolhaMenu = 0;
    int i = 0;      
    
        do {
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble(); 
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        
        
        System.out.println(System.lineSeparator() + 
                "===== O QUE VOCÊ QUER FAZER? =====" + 
                System.lineSeparator() + "[1] SOMAR" + 
                System.lineSeparator() + "[2] SUBTRAIR" + 
                System.lineSeparator() + "[3] MULTIPLICAR" + 
                System.lineSeparator() + "[4] DIVIDIR" + 
                System.lineSeparator());
        escolhaMenu = sc.nextInt();
                
        switch(escolhaMenu) {
        
            case 1:
                double soma = num1 + num2;
                System.out.println("O resultado será: " + soma);
        
            break;
            
            case 2:
                double subtrair = num1 - num2;
                System.out.println("O resultado será: " + subtrair);
            break;
            
            case 3: 
                double multiplicar = num1 * num2;
                System.out.println("O resultado será: " + multiplicar);
            break;
            
            case 4:
                double dividir = num1 / num2;
                System.out.println("O resultado será: " + dividir);
            break;
            
            default:
            System.out.println("Algo de errado não está certo!");
        }
        
            System.out.println("Você quer fazer mais alguma conta? " + 
                    System.lineSeparator() + "[1]SIM" + 
                    System.lineSeparator() + "[2]NÃO");
            i = sc.nextInt();
        } while (i == 1);
    
        System.out.println("Fim do programa! Muito obrigado! =D");
    
  }
}
