package estoqueloja;
import java.util.Scanner;

public class Atributo {
    private int quantidade;
    private int valor;
    private String autor;
    private String nome;
    static int contador = 1;
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributo(String nome, String autor, int valor, int quantidade ) {
        this.nome = nome;
        this.autor = autor;
        this.valor = valor; 
        this.quantidade = quantidade;
    }

    public Atributo() {
    }

    @Override
    public String toString() {
        return  "\n-----------------------------------" 
                + "\nLIVRO: " 
                + contador
                + "\n  Nome: " + nome
                + "\n  Autor: " + autor 
                + "\n  Valor: " + valor 
                + "\n  Quantidade: " + quantidade
                + "\n-----------------------------------";
    }

    public static Atributo[] livros(){
    
    Atributo[] livros = new Atributo[5];
    
    livros[0] = new Atributo("1984", "George Orwell", 20, 50 );
    livros[1] = new Atributo("O diário de Anne Frank", "Anne Frank", 35,20);
    livros[2] = new Atributo("Pequeno Príncipe", "Saint-Exupéry",50,25);
    livros[3] = new Atributo("It - A coisa", "Stephen King", 34,45);
    livros[4] = new Atributo("Harry Potter e a pedra filosofal", "J. K. Rowling", 25,60);
    
    return livros;
    }
    
    public static void mostrarEmTela(Atributo[] livros){
    for (int i = 0; i < livros.length; i++){
        System.out.println(livros[i]);
        contador++;
    };
    }
}
