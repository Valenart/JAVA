package receitadebolo;

    import java.util.Scanner;
public class ingredientes {
    private static int oleo;
    private static int cenoura;
    private static int farinhaTrigo;
    private static int acucar;
    private static int fermento;
    private static int ovos;
    
    //--------------------------------------------------------------------------
    
    public int getOleo() {
        return oleo;
    }

    public void setOleo(int oleo) {
        this.oleo = oleo;
    }

    public int getCenoura() {
        return cenoura;
    }

    public void setCenoura(int cenoura) {
        this.cenoura = cenoura;
    }

    public int getFarinhaTrigo() {
        return farinhaTrigo;
    }

    public void setFarinhaTrigo(int farinhaTrigo) {
        this.farinhaTrigo = farinhaTrigo;
    }

    public int getAcucar() {
        return acucar;
    }

    public void setAcucar(int acucar) {
        this.acucar = acucar;
    }

    public int getFermento() {
        return fermento;
    }

    public void setFermento(int fermento) {
        this.fermento = fermento;
    }

    public int getOvos() {
        return ovos;
    }

    public void setOvos(int ovos) {
        this.ovos = ovos;
    }
    
    @Override
    public String toString(){
    return         "Oleo: " + oleo + " xicaras" +
            "\n" + "Cenouras: " + cenoura + " unidades" +
            "\n" + "Farinha de Trigo: " + farinhaTrigo + " xicaras" +
            "\n" + "Acucar: " + acucar + " xicaras" +
            "\n" + "Fermento: " + fermento + " colheres" +
            "\n" + "Ovos: " + ovos + " unidades";
    }
    
    //--------------------------------------------------------------------------

    public ingredientes(int oleo, int cenoura, int farinhaTrigo, int acucar, int fermento, int ovos) { //construtor com parametros
        this.oleo = oleo;
        this.cenoura = cenoura;
        this.farinhaTrigo = farinhaTrigo;
        this.acucar = acucar;
        this.fermento = fermento;
        this.ovos = ovos;
    }

    //POLIMORFISMO com construtores
    public ingredientes() { //construtor sem parametros
    }

    //--------------------------------------------------------------------------
    
    public static void Massaingredientes (){
        Scanner entrada = new Scanner(System.in);
        
        int oleoTemp = 0; 
        int cenourasTemp = 0;
        int farinhaDeTrigoTemp = 0;
        int acucarTemp = 0;
        int fermentoTemp = 0;
        int ovosTemp = 0;
        
        ingredientes mistura = new ingredientes(0, 0, 0, 0, 0, 0);
        
        
        System.out.println("VAMOS FAZER UM BOLO DE CENOURA? (Sem cobertura)");
        System.out.println("A receita de referencia foi retirada do site 'tudogostoso.com' ");
        System.out.println("Link: https://www.tudogostoso.com.br/receita/23-bolo-de-cenoura.html \n");
        
        do {
        System.out.println("Quantas xicaras de oleo?");
        oleoTemp = entrada.nextInt();
        
        if (oleoTemp == 2){
            System.out.println("Muito bem!");
            mistura.setOleo(oleoTemp);
        }
        else if (oleoTemp > 2) {
            System.out.println("Xicaras demais! Olhe a receita novamente!");
        } else {
            System.out.println("Tem pouco óleo! Olhe a receita novamente!");
        }
        } while (oleoTemp != 2);
        
        //----------------------------------------------------------------------
        
        do {
        System.out.println("Quantas Cenouras?");
        cenourasTemp = entrada.nextInt();
        
        if (cenourasTemp == 3){
            System.out.println("Muito bem!");
            mistura.setCenoura(cenourasTemp);
        }
        else if (cenourasTemp > 3) {
            System.out.println("Cenouras demais! Olhe a receita novamente!");
        } else {
            System.out.println("Tem poucas cenouras! Olhe a receita novamente!");
        }
        
        } while (cenourasTemp != 3); 
        
        //----------------------------------------------------------------------
        
        
        do {
        System.out.println("Quantas xicaras de farinha de trigo?");
        farinhaDeTrigoTemp = entrada.nextInt();
        
        if (farinhaDeTrigoTemp == 2){
            System.out.println("Muito bem!");
            mistura.setFarinhaTrigo(farinhaDeTrigoTemp);
        }
        else if (farinhaDeTrigoTemp > 2) {
            System.out.println("Xicaras demais! Olhe a receita novamente!");
        } else {
            System.out.println("Tem pouca farinha! Olhe a receita novamente!");
        }
        
        } while (farinhaDeTrigoTemp != 2);
        
        //----------------------------------------------------------------------
        
        do {
        System.out.println("Quantas xicaras de acucar?");
        acucarTemp = entrada.nextInt();
        
        if (acucarTemp == 2){
            System.out.println("Muito bem!");
            mistura.setAcucar(acucarTemp);
        }
        else if (acucarTemp > 2) {
            System.out.println("Xicaras demais! Olhe a receita novamente!");
        } else {
            System.out.println("Tem pouco acucar! Olhe a receita novamente!");
        }
        
        } while (acucarTemp != 2);
        
        //----------------------------------------------------------------------
        
        do {
        System.out.println("Quantas colheres(cha) de fermento?");
        fermentoTemp = entrada.nextInt();
        
        if (fermentoTemp == 1){
            System.out.println("Muito bem!");
            mistura.setFermento(fermentoTemp);
        }
        else if (fermentoTemp > 1) {
            System.out.println("Colheres demais! Olhe a receita novamente!");
        } else {
            System.out.println("Tem pouco fermento! Olhe a receita novamente!");
        }
        
        } while (fermentoTemp != 1);
        
        //----------------------------------------------------------------------
        
        do {
        System.out.println("Quantos ovos?");
        ovosTemp = entrada.nextInt();
        
        if (ovosTemp == 4){
            System.out.println("Muito bem!");
            mistura.setOvos(ovosTemp);
        }
        else if (ovosTemp > 4) {
            System.out.println("Colheres demais! Olhe a receita novamente!");
        } else {
            System.out.println("Tem pouco fermento! Olhe a receita novamente!");
        }
        
        } while (ovosTemp != 4);
        
        //----------------------------------------------------------------------
        
        System.out.println("Vamos averiguar se esta tudo correto?\n");
        System.out.println(mistura.toString());
        System.out.println("Tudo certo! Vamos continuar\n");
        
        //----------------------------------------------------------------------
        
        System.out.println("\n Em um liquidificador, adicione a cenoura, os ovos e o oleo, depois misture.");
        int verificador1 = 0;
        
        //----------------------------------------------------------------------
        do {
            int passo1 = 0;

            System.out.println("Concluido? Sim [1]");
            passo1 = entrada.nextInt();

            if (passo1 == 1) {
                verificador1 = 1;
                System.out.println("Vamos para o proximo passo!\n");
            } else {
                System.out.println("Antes do proximo passo, conclua este antes!");
            }
        
        } while (verificador1 == 0);
        //----------------------------------------------------------------------
        
        System.out.println("\n Acrescente o açúcar e bata novamente por 5 minutos.");
        int verificador2 = 0;
        
        //----------------------------------------------------------------------
        
        
         do {
        int passo2 = 0;
        
        System.out.println("Concluido? Sim [1]");
        passo2 = entrada.nextInt();
        
        if (passo2 == 1) {
            verificador2 = 1;
            System.out.println("Vamos para o proximo passo!\n");
        } else {
            System.out.println("Antes do proximo passo, conclua este antes!");
        }
        
        } while (verificador2 == 0);
         
        //----------------------------------------------------------------------
        
        System.out.println("\n Em uma tigela ou na batedeira, adicione a farinha de trigo e depois misture novamente.");
        int verificador3 = 0;
        
        //----------------------------------------------------------------------
        
        
         do {
        int passo3 = 0;
        
        System.out.println("Concluido? Sim [1]");
        passo3 = entrada.nextInt();
        
        if (passo3 == 1) {
            verificador3 = 1;
            System.out.println("Vamos para o proximo passo!\n");
        } else {
            System.out.println("Antes do proximo passo, conclua este antes!");
        }
        
        } while (verificador3 == 0);
         
        //----------------------------------------------------------------------
        
        System.out.println("\n Acrescente o fermento e misture lentamente com uma colher.");
        int verificador4 = 0;
        
        //----------------------------------------------------------------------
        
        
         do {
        int passo4 = 0;
        
        System.out.println("Concluido? Sim [1]");
        passo4 = entrada.nextInt();
        
        if (passo4 == 1) {
            verificador4 = 1;
            System.out.println("Vamos para o proximo passo!\n");
        } else {
            System.out.println("Antes do proximo passo, conclua este antes!");
        }
        
        } while (verificador4 == 0);
         
        //----------------------------------------------------------------------
        
        System.out.println("\n Asse em um forno preaquecido a 180° C por aproximadamente 40 minutos.");
        int verificador5 = 0;
        
        //----------------------------------------------------------------------
        
        
         do {
        int passo5 = 0;
        
        System.out.println("Concluido? Sim [1]");
        passo5 = entrada.nextInt();
        
        if (passo5 == 1) {
            verificador5 = 1;
             System.out.println("Esta pronto o seu bolinho de cenoura! Aproveite! =D");
        } else {
            System.out.println("Antes do proximo passo, conclua este antes!");
        }
        
        } while (verificador5 == 0);
         
        //---------------------------------------------------------------------- 
        
       
    }
}
