package calculadora;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MarcoCalculadora extends JFrame {

    public MarcoCalculadora() {
        setTitle("Calculadora básica");
        setBounds(300, 300, 600, 500);
        Lamina miLamina = new Lamina();
        add(miLamina);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asi se indica queel contenedor se ajuste al tamaño de los que contiene.
        //pack();
    }

}

class Lamina extends JPanel {

    JPanel tecladoCalculadora;
    JButton pantallaCalculadora;

    public Lamina() {

        BorderLayout bLayout = new BorderLayout();
        setLayout(bLayout);
        pantallaCalculadora = new JButton("0");
        pantallaCalculadora.setEnabled(false);
        add(pantallaCalculadora, BorderLayout.NORTH);

        //Creo una nueva lamina que es la que va a contener las teclas de la calculadora
        tecladoCalculadora = new JPanel();
        GridLayout gLayout = new GridLayout(4,4);
        tecladoCalculadora.setLayout(gLayout);
        add(tecladoCalculadora, BorderLayout.CENTER);
        Oyente oyente = new Oyente();
        ponerBoton("0", oyente);
        ponerBoton("1", oyente);
        ponerBoton("2", oyente);
        ponerBoton("3", oyente);
        ponerBoton("4", oyente);
        ponerBoton("5", oyente);
        ponerBoton("6", oyente);
        ponerBoton("7", oyente);
        ponerBoton("8", oyente);
        ponerBoton("9", oyente);
        // ponerBoton("+", oyente);
        // ponerBoton("-", oyente);
        // ponerBoton("*", oyente);
        // ponerBoton("/", oyente);
        // ponerBoton("=", oyente);
        ponerBoton(".", oyente);
    }

    private class Oyente implements ActionListener{

        private boolean principio = true;
        public Oyente(){

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio) {
                pantallaCalculadora.setText("");
                principio = false;
            }
            pantallaCalculadora.setText(pantallaCalculadora.getText() + entrada);
            
        }

    }

    private void ponerBoton(String simbolo, Oyente oyente){
        JButton botonCalculadora = new JButton(simbolo);
        tecladoCalculadora.add(botonCalculadora);
        botonCalculadora.addActionListener(oyente);
    }

}
