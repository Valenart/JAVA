import java.util.Scanner;

class Main {
  public static void main(String[] args) {

         /*CRIE UM PROGRAMA QUE MOSTRE O MAIOR VALOR DENTRO DE UM ARRAY COM 5 POSIÇÕES USANDO O FOR*/
        
        //SCANNER
        Scanner sc = new Scanner(System.in);
        
        
        //VARIÁVEIS E ARRAYS
        int[] valores = new int[5];
        String[] nomes = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};
        int maior = 0;
        
        
        for (int i = 0;i <=4;i++) {
            System.out.println("Escreva o " + nomes[i] +  " número: ");
            valores[i] = sc.nextInt();
            
            if (maior < valores[i]) {
                maior = valores[i];
            }
        }
    
        System.out.println("O maior valor dentro do array é: " + maior);
  }
}
