package eventosRaton;

import javax.swing.*;


public class ObjFuenteMarco extends JFrame {

    public ObjFuenteMarco(){
        //Debo dar características al marco (visible, titulo, tamaño) y luego crear una instancia del oyente
        //para añadirlo al marco.
        setVisible(true);
        setTitle("Marco para trabajar con eventos de ratón");
        setBounds(300, 300, 500, 350);

        //Establecemos el objeto Listener que estará a la escucha de los eventos de ratón.
        ObjOyenteDeRaton oyente = new ObjOyenteDeRaton();
        addMouseListener(oyente);
        ObjOyenteDeRaton2 oyente2 = new ObjOyenteDeRaton2();
        addMouseMotionListener(oyente2);
    }
    
}
