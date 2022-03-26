package eventosRaton;

import java.awt.event.*;

//Este objeto listener solo estará a la escucha de los eventos de ratón que se produzcan sobre el objeto fuente (Marco).
public class ObjOyenteDeRaton extends MouseAdapter {

    public void mouseClicked(MouseEvent e){
        System.out.println("El ratón ha sido clickado en la posición x: " + e.getX());
    }

    public void mouseEntered(MouseEvent e){
        System.out.println("El ratón ha entrado");
    }

    public void mousePressed(MouseEvent e){

        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Ha sido presionado el boton izquierdo del ratón");
        }
        if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("Ha sido presionado el boton central del ratón");
        }
        if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("Ha sido presionado el boton derecho del ratón");
        }
    }

    public void mouseReleased(MouseEvent e){
        System.out.println("El ratón ha sido released en la posición y: " + e.getY());
        //System.out.println("El ratón ha sido presionado y: " + e.getClickCount() + " veces.");
    }
    
}
