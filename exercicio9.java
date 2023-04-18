import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    /*
    CRIE UM PROGRAMA JAVA EM QUE O USUÁRIO PRECISARÁ DIGITAR CORRETAMENTE
    O LOGIN A SENHA CORRETAMENTE EM 3 TENTATIVAS. CASO O USUÁRIO NÃO CONSIGA
    EFETUAR O LOGIN, QUE APAREÇA A SEGUINTE MENSAGEM NA TELA: 
    "3 TENTATIVAS INVÁLIDAS. TENTE NOVAMENTE MAIS TARDE."
    */ 
    
    //VARIÁVEIS    
    String verflogin = "";    
    String verfsenha = "";    
   
    String[] login = {"Valenart"};
    String[] senha = {"123456789"};
    int i = 1;
    
    //SCANNER
    Scanner sc = new Scanner(System.in);
        
            System.out.println("------- BEM VINDO! -------");
        do {
            
            System.out.println(System.lineSeparator());
            System.out.println("PARA CONTINUAR, DIGITE O LOGIN:");
            verflogin = sc.nextLine();
            System.out.println("AGORA, SUA SENHA: ");
            verfsenha = sc.nextLine();
        
        if (verflogin.equals(login[0]) && verfsenha.equals(senha[0])) {
            System.out.println("Login bem sucedido!");
            i = 5;
        } else {
            System.out.println("Login ou senha inválidos. Tente novamente.");
            i++;    
           }
        
        } while (i <= 3);
        
        if (i == 4) {
            System.out.println("3 Tentativas inválidas! Tente novamente mais tarde.");
        }
        else if (i == 5) {
            System.out.println("Obrigado por testar!");
        }   
  }
}
