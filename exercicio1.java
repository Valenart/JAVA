import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
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
