package graficos.estadoVentana;

import javax.swing.JFrame;

public class Principal {

    public static void main ( String[] args ){

        ObjetoFuenteMarco miMarco = new ObjetoFuenteMarco();
        miMarco.setTitle("Ventana cambio de estado evento");
        miMarco.setBounds(300, 300, 500, 350);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
