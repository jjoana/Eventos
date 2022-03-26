package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lamina extends JPanel implements ActionListener {

    //Creo objetos de tipo JButton.
    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonAmarillo = new JButton("Amarillo");

    public Lamina(){

        //Añado el boton a la lamina.
        add(botonAzul);
        botonAzul.addActionListener(this);  //Objeto evento: (Action = evento de tipo ratón).
                                            //Fuente: el botonAzul.
                                            //La interfaz ActionListener responde a eventos de ratón.
                                            //Destino: La lámina. Queda a la escucha del evento tipo raton: addActionListener(this).
        add(botonRojo);
        add(botonAmarillo);
        botonRojo.addActionListener(this);
        botonAmarillo.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object botonPulsado = e.getSource();
        if (botonPulsado == botonAzul){
            setBackground(Color.BLUE);
        } else if (botonPulsado == botonAmarillo){
            setBackground(Color.YELLOW);
        } else if (botonPulsado == botonRojo){
            setBackground(Color.RED);
        }
    }
    
}
