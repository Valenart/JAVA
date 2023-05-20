package exercicioxx;

import java.awt.*;

public class ExercicioXX {

    public static void main(String[] args) {
        /*FAÇA UM PROGRAMA QUE MOSTRE AO USUÁRIO A ALTURA E A LARGURA DA 
        RESOLUÇÃO USADA NO SEU MONITOR*/
        Dimension size
            = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int)size.getWidth();
        
        int height = (int)size.getHeight();
        
        System.out.println("Sua resolucao e: " +
                width + " x " + height);
    }
    
}
