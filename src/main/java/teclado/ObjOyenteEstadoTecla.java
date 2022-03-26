package teclado;

import java.awt.event.*;

public class ObjOyenteEstadoTecla extends KeyAdapter {

    static boolean seguir = true;

    public ObjOyenteEstadoTecla(){
        
    }
    
    public void keyPressed(KeyEvent e){
        System.out.println("La tecla presionada ha sido: " + e.getKeyChar());
        if (e.getKeyCode() == 48){
            System.out.println("Identificada la tecla");
        }
    }
    
}
