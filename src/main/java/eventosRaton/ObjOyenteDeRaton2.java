package eventosRaton;

import java.awt.event.*;

public class ObjOyenteDeRaton2 implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("El ratón se está arrastrando");
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("El ratón se está moviendo");
        
    }
    
}
