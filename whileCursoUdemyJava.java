package whilecursoudemyjava;

    import java.util.Scanner;

public class whileCursoUdemyJava {

    public static void estruturawhile(){
    Scanner sc = new Scanner(System.in);
    int cont = 0;
    int a = 0;
    
        while (a != 2023){
        System.out.println("Digite a sua senha: ");
        a = sc.nextInt();
        if (a != 2023){
        System.out.println("Senha inválida, tente novamente.");
        } 
        
    cont++;
    }
        System.out.println("Parabéns você acertou!");
        System.out.println("Você precisou tentar " + cont + " vezes para acertar!"); 
    }
    
    public static void main(String[] args) {

    estruturawhile();
        
        
    }
    
}
