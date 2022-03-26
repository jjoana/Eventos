package graficos.eventosVentanaAdaptador;

import javax.swing.JFrame;

public class PruebaEventosVentana {

    public static void main ( String[] args ){

        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(300, 300, 500, 350);
        Marco miMarco2 = new Marco();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(900, 300, 500, 350);
    }
    
}
