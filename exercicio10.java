import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*
        CRIE UM PROGRAMA QUE LEIA 3 NÚMEROS INTEIROS DO USUÁRIO E OS ARMAZENE EM UM ARRAY.
        EM SEGUIDA, VERIFIQUE SE CADA NÚMERO É POSITIVO OU NEGATIVO E IMPRIMA UMA MENSAGEM INFORMANDO ISSO.
        UTILIZE A ESTRUTURA DE REPETIÇÃO "FOR" E A ESTRUTURA CONDICIONAL "IF-ELSE" PARA IMPLEMENTAR O PROGRAMA.
        */

        //SCANNER
        Scanner sc = new Scanner(System.in);
        
        //VARIAVEIS E VETORES
        int[] valores = new int[3];
        int i = 0;
        
        System.out.println("Escreva 3 números: ");
       
        for (i = 0; i < 3; i++){
            valores[i] = sc.nextInt();
        if (valores[i] < 0){
            System.out.println("O número: "+ valores[i] + " é negativo");
            } else {
            System.out.println("O número: "+ valores[i] + " é positivo"); 
            }
        }
        System.out.println("Obrigado por testar o código! =D");
  }
}
