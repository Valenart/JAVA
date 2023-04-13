import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    /*
    DESENVOLVA UM PROGRAMA EM JAVA QUE SOLICITE AO USUÁRIO QUE INFORME SEU
    GÊNERO (MASCULINO OU FEMININO). CASO O USUÁRIO INFORME UM GÊNERO           
    INVÁLIDO, O PROGRAMA DEVE EXIBIR UMA MENSAGEM DE ERRO E SOLICITAR QUE O     
    USUÁRIO INFORME NOVAMENTE. O PROGRAMA DEVE CONTINUAR SOLICITANDO AO     
    USUÁRIO QUE INFORME SEU GÊNERO ATÉ QUE UMA OPÇÃO VÁLIDA SEJA INFORMADA.
    */
    
    
    // SCANNER
     Scanner sc = new Scanner(System.in);
        
       String valor; 
       int validacao = 0;
       
       
        do {
            System.out.println("Digite o seu sexo (M/F):  ");
            valor = sc.nextLine().toLowerCase();
            
            if (valor.equals("m") || valor.equals("f")){
            validacao = 1;
            }
            
            else {
            System.out.println("Digite novamente!");
            }
      } while (validacao == 0);

    System.out.println("Ok! Obrigado pela resposta! ");
  }
}
