import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);    
        
        System.out.println("Quantos anos voce tem? ");
        int valor = sc.nextInt();
        
        int meses = valor * 12;
        int dias = valor * 365;
        System.out.println("Voce tem: " + System.lineSeparator()
                    + meses + " Meses de vida" +  System.lineSeparator()
                    + dias + " Dias de vida " );   
  }
}
