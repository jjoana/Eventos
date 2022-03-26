package eventosDeFoco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Esta clase corresponde a la Lamina que ponemos en el Marco.
//En la lámina incluimos 2 TextField.
public class Lamina extends JPanel {
    
    //Variables con alcance dentro del ámbito la clase ObjetoFuente.
    private JTextField campoDeTexto1 = new JTextField();
    private JTextField campoDeTexto2 = new JTextField();
    private ObjetoOyente foco;
    
    //public ObjetoFuente(){}   No necesito constructor. Es suficiente con el constructor por defecto.

    //Creo una clase interna a la clase ObjetoFuente.
    //De esta forma puedo acceder desde ella a los objeto foco1 y foco2, de otra manera no podría
    private class ObjetoOyente implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("He ganado el foco");
        }
    
        @Override
        public void focusLost(FocusEvent e) {
            String email = campoDeTexto1.getText();
            boolean comprobacion = false;
            for (int i=0; i<email.length(); i++){
                if (email.charAt(i)=='@'){
                    comprobacion = true;
                }
            }
            if (comprobacion){
                System.out.println("Es una dirección de email válida");
            }
        }
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        campoDeTexto1.setBounds(120, 10, 150, 20);
        add(campoDeTexto1);
        campoDeTexto2.setBounds(120, 50, 150, 20);
        add(campoDeTexto2);
        foco = new ObjetoOyente();
        campoDeTexto1.addFocusListener(foco);
        //campoDeTexto2.addFocusListener(foco);
    }

    
}
