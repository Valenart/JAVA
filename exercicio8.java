import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        
    /*
    CRIE UM PROGRAMA ONDE O USUÁRIO DEVERÁ DIGITAR UM NÚMERO DE 0 A 20, ONDE
    DEVERÁ SER MOSTRADO TODOS OS NÚMEROS DEPOIS DO NUMERO DA ENTRADA DO
    USUÁRIO ATÉ O 20.
    */
    
    //VARIÁVEIS    
    int valor = 0;    
    int a = 0;    
    //SCANNER
    Scanner sc = new Scanner(System.in);  
   
    do {
        System.out.println("Escreva um número de 0 a 20:");
        valor = sc.nextInt();
    
        // Exemplo de loop "for" que imprime os números de 1 a 5    
        if (valor <= 20 && valor >= 0) {
            for (int i = valor+1; i <= 20; i++) {
                System.out.println(i);
                    
            } 
        System.out.println("Esse são os números que tem depois do número: " + valor);    
            
            if (valor == 20){
                System.out.println("Ops! dentre esse intervalo não existe número maior que o 20!");
            }
        } else {
            System.out.println("Escreva entre 0 e 20!");
        }
        
        System.out.println(System.lineSeparator());
        System.out.println("Quer tentar novamente?");
        System.out.println("[1] SIM" + System.lineSeparator() + 
                           "[2] NÃO");
        a = sc.nextInt();
    } while (a == 1); 
        System.out.println(System.lineSeparator());
        System.out.println("Obrigado! O programa se encerra aqui! =D");
    sc.close();
  }
}
