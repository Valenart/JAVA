package ternario;

import java.util.Scanner;

public class Ternario {

    public static int conta(int a, int b, int c) {
        int total = 0;
        total = a + b + c;
        return total;
    }

    public static void showMe(int value) {
        if (value < 10) {
            System.out.println("O valor é menor que 10!");
        } else if (value >= 10 && value <= 20) {
            System.out.println("O valor está entre 10 e 20");
        } else if (value > 20 ){
            System.out.println("O valor é maior que 20!");
        } else {
            System.out.println("Não pode ser valor negativo!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];
        int cont = 0;

        do {
            cont++;
            System.out.println(cont + "- Escreva o " + cont + " número: ");
            valores[cont - 1] = sc.nextInt();
        } while (cont < 3);

        int total = conta(valores[0], valores[1], valores[2]);
        showMe(total);

        String tentar = "";
        String tentar2 = "";
        System.out.println("Quer tentar novamente? SIM ou NAO?");
        tentar = sc.next().toUpperCase();
        tentar2 = (tentar.equals("SIM")) ? "Que pena, a vida nao sao flores kk" : "Você não iria conseguir do mesmo jeito kk";
        System.out.println(tentar2);
        
        sc.close();
    }
}
