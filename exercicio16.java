import java.util.Scanner;

class Main {

    public static double celsiusF (double celsius){
        double convertidoFah = 0;
    
        convertidoFah = ((celsius * 1.8) + 32);
        
    return convertidoFah;
    }
        
    public static double celsiusK (double celsius){
        double convertidoKel = 0;
        
        convertidoKel = (celsius + 273.15);
        
    return convertidoKel;
    }
    
    public static double fahrenheitC (double fahrenheit){
        double convertidoCel = 0;
        
        convertidoCel = ((fahrenheit - 32)/1.8);
        
    
    return convertidoCel;
    }
    
    public static double fahrenheitK (double fahrenheit) {
        double convertidoKel = 0;
        
        convertidoKel = (((fahrenheit - 32)/1.8) +273.15);
        
    return convertidoKel;    
    }
    
    public static double KelvinC (double kelvin) {
        double convertidoCel = 0;
        
        convertidoCel = (kelvin - 273.15);
        
    return convertidoCel;
    }
    
    public static double KelvinF (double kelvin) {
        double convertidoFah = 0;
        
        convertidoFah = (((kelvin - 273.15) * 1.8) +32);
        
    return convertidoFah;
    }
 
  //------------------------------------------------------------------------------
  //------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    //SCANNER
        Scanner sc = new Scanner(System.in);
        
        //VARIAVEIS
        int i = 0;
        int valor = 0;
        int escolha = 0;
        
        System.out.println("------CONVERSOR DE TEMPERATURAS------");
        do {
        
        
            System.out.println("QUAL UNIDADE SERÁ USADA? \n[1] CELSIUS \n[2]FAHRENHEIT \n[3] KELVIN");
            int selecionado = sc.nextInt();
        
        
            switch(selecionado){

//------------------------------------------------------------------------------
                
                case 1:
                    System.out.println("Qual será a segunda medida? \n[1] Fahrenheit \n[2] Kelvin ");
                    escolha = sc.nextInt();
                    
                        if(escolha == 1){
                            System.out.println("Qual é o valor em Celsius? ");
                            valor = sc.nextInt();
                            
                            System.out.println("O valor de Celsius para Farenheit será: "
                                    + celsiusF(valor) + "°F");  
                        }
                        
                        else if (escolha == 2){
                            System.out.println("Qual é o valor em Celsius? ");
                            valor = sc.nextInt();
                            
                            System.out.println("O valor de Celsius para Kelvin será: "
                                    + celsiusK(valor) + "°K");
                        } 
                    break;

//------------------------------------------------------------------------------
                    
                case 2:
                    System.out.println("Qual será a segunda medida? \n[1] Celsius \n[2] Kelvin ");
                    escolha = sc.nextInt();
                    
                    if (escolha == 1){
                        System.out.println("Qual é o valor em Farenheit? ");
                            valor = sc.nextInt();
                            
                            System.out.println("O valor de Farenheit para Celsius será: "
                                    + fahrenheitC(valor) + "°C");
                    }
                    else if (escolha == 2){
                        System.out.println("Qual é o valor em Farenheit? ");
                            valor = sc.nextInt();
                            
                            System.out.println("O valor de Farenheit para Kelvin será: "
                                    + fahrenheitK(valor) + "°K");
                    }
                    break;
                    
//------------------------------------------------------------------------------  
                    
                case 3:
                    System.out.println("Qual será a segunda medida? \n[1] Celsius \n[2] Fahrenheit");
                    escolha = sc.nextInt();
                    if (escolha == 1){
                        System.out.println("Qual é o valor em Kelvin? ");
                            valor = sc.nextInt();
                            
                            System.out.println("O valor de Kelvin para Celsius será: "
                                    + KelvinC(valor) + "°C");
                    }
                    else if (escolha == 2){
                        System.out.println("Qual é o valor em Kelvin? ");
                            valor = sc.nextInt();
                            
                            System.out.println("O valor de Kelvin para Farenheit será: "
                                    + KelvinF(valor) + "°F");
                    }
                    break;

//------------------------------------------------------------------------------                  
                    
                default:
                    System.out.println("Número não encontrado. Tentar novamente? \n[1] Sim \n[2] Não");                    
                    int valorDefault = sc.nextInt();
                    
                    if (valorDefault == 1){
                        boolean escolha4 = true;
                        if (escolha4 = true){
                        i++;
                        }
                    }
                    
                    else if (valorDefault == 2){
                    System.out.println("Não? Ok!");
                    }
                    
                    break;
            } 
        } while (i == 1);
        
        System.out.println("OBRIGADO POR TESTAR O CÓDIGO! =D");
        sc.close();
  }
}
