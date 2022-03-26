package graficos.estadoVentana;

import java.awt.Frame;
import java.awt.event.*;

public class ObjOyenteDeCambioEstadoVentana extends WindowAdapter{

    public void windowStateChanged (WindowEvent e){

        if (e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana ha sido maximizada");
        }

        if (e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana ha sido iconizada");
        }


    
    }

}