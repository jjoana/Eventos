package variasFuentes;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

//Clase de la cual instanciamos objetos de tipo JPanel (LaminaAccion).
public class LaminaAccion extends JPanel {

    //Declaramos variables de clase. Son los tres botones que pintaremos sobre la lámina
    //Quero que sean atributos de clase para poder acceder a ellas desde cualquier método de esta clase.
    private JButton botonAmarillo;
    private JButton botonAzul;
    private JButton botonRojo;

    public LaminaAccion(){

        //En el constructor de la clase  LaminaAccion creamos tres objetos de clase Oyente (deriva de AbstractAction).
        Oyente oyenteRojo = new Oyente("Rojo", new ImageIcon("/home/jjoana/Descargas/icono1.png"), Color.RED);
        Oyente oyenteAzul = new Oyente("Azul", new ImageIcon("/home/jjoana/Descargas/icono2.png"), Color.BLUE);
        Oyente oyenteAmarillo = new Oyente("Amarillo", new ImageIcon("/home/jjoana/Descargas/icono3.png"), Color.YELLOW);

        //Creamos botones (JButton) con el constructor que requiere como parámetro un objeto de la clase Action (Oyente)
        JButton botonRojo = new JButton(oyenteRojo);
        add(botonRojo);
        JButton botonAzul = new JButton(oyenteAzul);
        add(botonAzul);
        JButton botonAmarillo = new JButton(oyenteAmarillo);
        add(botonAmarillo);

        //Se crea un mapa de entrada (Clase InputMap)
        InputMap mapaDeEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        //Creamos las combinaciones de teclas que desencadenarán acciones.
        KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("ctrl Y");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl R");

        //Asignar las combinaciones de teclas anteriores a objetos
        mapaDeEntrada.put(teclaAmarilla, "fondoAmarillo");
        mapaDeEntrada.put(teclaAzul, "fondoAzul");
        mapaDeEntrada.put(teclaRoja, "fondoRojo");

        //Asignar a los objetos creados anteriormente una acción (por ejemplo al objeto fomdoAmarillo se le asigna la acción oyenteAmarillo)
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondoAmarillo", oyenteAmarillo);
        mapaAccion.put("fondoAzul", oyenteAzul);
        mapaAccion.put("fondoRojo", oyenteRojo);

    }

    //Creo una clase interna (Inner Class) de ella instanciaremos el objeto Oyente.
    private class Oyente extends AbstractAction{

        //Constructor de la clase.
        public Oyente (String nombre, Icon icono, Color color){
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Pone la lámina de color: " + nombre);
            putValue("ColorDeFondo", color);    
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = (Color) getValue("ColorDeFondo");
            setBackground(color);
            System.out.println("Botón pulsado: " + getValue(Action.NAME) + "   Descripcion corta del botón: " + getValue(Action.SHORT_DESCRIPTION));
        }
 
    }
    
}


