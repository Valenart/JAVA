package exercicioxx;

import java.awt.*;

public class ExercicioXX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // bring
        Dimension size
            = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int)size.getWidth();
        
        int height = (int)size.getHeight();
        
        System.out.println("Sua resolucao e: " +
                width + " x " + height);
    }
    
}
