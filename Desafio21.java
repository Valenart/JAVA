package exercicio;

import java.util.Scanner;

public class Exercicio {
       
    public static void main(String[] args) {
        
String original = "Salut, JE Suis ValENArt!   ";
String s01 = original.toLowerCase();
String s02 = original.toUpperCase();
String s03 = original.trim();
String s04 = original.substring(7);
String s05 = original.substring(7, 23);
String s06 = original.replace('!', '?');
String s07 = original.replace("ValENArt", "Richard");
int i = original.indexOf("al");
int j = original.lastIndexOf("al");
//------------------------------------------------------------------------------

    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(7): -" + s04 + "-");
    System.out.println("substring(7, 23): -" + s05 + "-");
    System.out.println("replace('!', '?'): -" + s06 + "-");
    System.out.println("replace('ValENArt', 'Richard'): -" + s07 + "-");
    System.out.println("Index of 'al': " + i);
    System.out.println("Last index of 'al': " + j);
    
String stringTeste = "Bonjour BomDia GutenMorgen GoodMorning";
String[] teste = stringTeste.split(" ");
String frase1 = teste[0];
String frase2 = teste[1];
String frase3 = teste[2];
String frase4 = teste[3];

    for (int k = 0; k<4 ;k++){
        System.out.println(teste[k]);
    }
    
    }
    
}
