import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        
        /*
        ESCREVA UM PROGRAMA QUE SOLICITA AO USUÁRIO QUE DIGITE 10 NÚMEROS E,
        EM SEGUIDA, EXIBE O MAIOR NÚMERO DIGITADO.
        */
    
        //SCANNER
        Scanner sc = new Scanner(System.in);
        
        //VARIÁVEIS E ARRAYS
        int[] var = new int[10];
        int i = 0;
        int j = 0;
        String[] num = {"primeiro ", "segundo ", "terceiro ", "quarto ",
                "quinto ", "sexto ", "sétimo", "oitavo ", "nono ", "décimo "};
        
        do{
            System.out.println("Digite o " + num[i] + "número: ");
            var[i] = sc.nextInt();   
            i++;
        } while (i <10);
        
        int maior = var[0]; // assume que o primeiro elemento é o maior

        for (int k = 1; k < var.length; k++) {
        if (var[k] > maior) {
        maior = var[k];
            }
        }
        
        System.out.println("O maior número digitado é: " + maior);
  }
}
