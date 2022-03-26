package graficos.eventosVentanaAdaptador;
import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

public class Marco extends JFrame{

    public Marco (){
        //setTitle("Prueba de marco para eventos de ventana");
        //setBounds(300, 300, 500, 350);
        setVisible(true);
        MVentana oyente = new MVentana();
        addWindowListener(oyente);
    }
    
}
