class Main {
  public static void main(String[] args) {
    
    /*
    FAÇA UM PROGRAMA SIMPLES, ONDE IMPRIMA A MÉDIA ARITMÉTICA DOS NÚMEROS 8,9 E 7.
    A MÉDIA DOS NÚMEROS 4, 5 E 6. A SOMA DAS DUAS MÉDIAS. A MÉDIA DAS MÉDIAS.
    */
    
    int grupo1 = ((7 + 8 + 9)/3);
    System.out.println("A média do grupo 1 (7,8 e 9) será: " + grupo1);
    
    int grupo2 = ((4 + 5 + 6)/3);   
    System.out.println("A média do grupo 2 (4,5 e 6) será: " + grupo2);

    int mediaSoma =  grupo1 + grupo2;
    System.out.println("a soma das médias será: " + mediaSoma);

    int mediaTotal = mediaSoma / 2;
    System.out.println("A média total das 2 será: " + mediaTotal);
  }
}
