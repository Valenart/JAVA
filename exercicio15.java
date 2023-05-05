import java.util.Scanner;

class Main {
    public static int teste (int a, int b){
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        
        //SCANNER
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Defina A: ");
        int a = sc.nextInt();
        System.out.println("Defina B: ");
        int b = sc.nextInt();

        int resultado = teste(a, b);
        System.out.println("O resultado é: " + resultado);

      sc.close();
  }
}
