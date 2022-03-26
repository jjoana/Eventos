package graficos.eventosVentana;

import javax.swing.JFrame;

public class Principal {

    public static void main ( String[] args ){

        ObjFuenteMarco miMarco = new ObjFuenteMarco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(300, 300, 500, 350);
        ObjFuenteMarco miMarco2 = new ObjFuenteMarco();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(900, 300, 500, 350);
    }
    
}
