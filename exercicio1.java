import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    /*
    FAÇA UM PROGRAMA QUE ELE LEIA A IDADE DO USUÁRIO E MOSTRE ELA EM DIAS
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
    */
    
    Scanner sc = new Scanner(System.in);    
        
        System.out.println("Quantos anos voce tem? ");
        int anos = sc.nextInt();

        System.out.println("Quantos meses? ");
        int meses = sc.nextInt();

        System.out.println("Quantos dias? ");
        int dias = sc.nextInt();
        
        int total = (((anos*365) + meses*30) + dias);
    
        System.out.println(System.lineSeparator() 
                    + anos + " Anos " + System.lineSeparator()
                    + meses + " Meses " +  System.lineSeparator()
                    + dias + " Dias " + System.lineSeparator()
                    + "Voce tem: " + total + " dias de vida");   
  }
}
