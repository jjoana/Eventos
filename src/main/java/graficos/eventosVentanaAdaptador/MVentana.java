package graficos.eventosVentanaAdaptador;

import java.awt.event.*;

public class MVentana extends WindowAdapter{


    public void windowIconified (WindowEvent e){

        System.out.println("La ventana se ha iconizado");
        
    }

    
}
