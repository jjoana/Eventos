package graficos.eventosVentana;
import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

public class ObjFuenteMarco extends JFrame{

    public ObjFuenteMarco (){
        //setTitle("Prueba de marco para eventos de ventana");
        //setBounds(300, 300, 500, 350);
        setVisible(true);
        ObjOyenteCambioEstadoVentana oyente = new ObjOyenteCambioEstadoVentana();
        addWindowListener(oyente);
    }
    
}
