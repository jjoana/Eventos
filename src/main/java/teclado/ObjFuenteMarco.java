package teclado;

import javax.swing.*;

public class ObjFuenteMarco extends JFrame {

    public ObjFuenteMarco(){

        //Establezco el Marco como objeto fuente para que la aplicación no se cierre hasta que cierre el marco
        setVisible(true);
        setBounds(300, 300, 500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Establezco el Marco como objeto fuente y le asocio un oyente para estar a la escucha 
        //de los cambios de estado en las teclas del teclado.
        ObjOyenteEstadoTecla oyente = new ObjOyenteEstadoTecla();
        addKeyListener(oyente);

    }
    
}
