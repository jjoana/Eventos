package graficos;

import javax.swing.*;

/**
 * Trabajando con eventos
 *
 */
public class PruebaEventos{
    public static void main( String[] args ){

        Marco miMarco = new Marco();
        miMarco.setBounds(700, 300, 500, 300);
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
