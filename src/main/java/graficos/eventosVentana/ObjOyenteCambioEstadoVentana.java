package graficos.eventosVentana;
import java.awt.event.*;

public class ObjOyenteCambioEstadoVentana extends WindowAdapter {

    public void windowActivated (WindowEvent e){
        System.out.println("La ventana se ha activado");
    }

    public void windowClosed (WindowEvent e){
        System.out.println("La ventana se ha cerrado");     
    }

    public void windowClosing (WindowEvent e){
        System.out.println("La ventana se está cerrando");      
    }

    public void windowDeactivated (WindowEvent e){
        System.out.println("La ventana se ha desactivado");      
    }

    public void windowDeiconified (WindowEvent e){
        System.out.println("La ventana se ha desiconizado");    
    }

    public void windowIconified (WindowEvent e){
        System.out.println("La ventana se ha iconizado");   
    }

    public void windowOpened (WindowEvent e){
        System.out.println("La ventana se ha abierto");        
    }
    
}
