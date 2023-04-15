    import java.util.Scanner;

    class main {

    public static void main(String[] args) {
    
    /*
    FAÇA UM PROGRAMA EM JAVA PARA COLETAR DADOS DE QUATRO PESSOAS.
    O PROGRAMA DEVE SOLICITAR O NOME, A IDADE E O SEXO DE CADA PESSOA E ARMAZENÁ-LOS EM ARRAYS.
    É NECESSÁRIO GARANTIR QUE OS DADOS INSERIDOS SEJAM VÁLIDOS.
    AO FINAL, O PROGRAMA DEVE IMPRIMIR OS DADOS DE TODAS AS PESSOAS.  
    */
        
    //SCANNER
    Scanner sc = new Scanner(System.in);  
    int i = 0;
    String res;
    String [] nomes = new String[4];
    int[] idade = new int[4]; 
    String [] sexo = new String[4]; 
     
     
    do {
         System.out.println("Qual é o nome da " + (i+1) + " pessoa?" );
         nomes[i] = sc.nextLine();
         System.out.println("Qual é a idade?" );
         idade[i] = sc.nextInt();
         sc.nextLine();
         System.out.println("Sexo? [M/F] " );
         res = sc.nextLine().toLowerCase();
        
        do {
            if (res.equals("m") || res.equals("f")){
            sexo[i] = res;
            } else {
            System.out.println("Só responda M ou F!");
            res = sc.nextLine().toLowerCase();
            }
        } while (!res.equals("m") && !res.equals("f"));
        
        i++;
     } while (i != 4);   
        
    for (int j = 0; j < nomes.length; j++) {
    System.out.println("Nome: " + nomes[j]);
    System.out.println("Idade: " + idade[j]);
    System.out.println("Sexo: " + sexo[j]);
    System.out.println("------------------------");
    }    
  }
}
