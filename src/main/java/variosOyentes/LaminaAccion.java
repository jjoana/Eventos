package variosOyentes;

import javax.swing.*;
import java.awt.event.*;

//Clase pública que crea la lámina del primer marco (contiene 2 botones)
public class LaminaAccion extends JPanel {

    private JButton nuevo;
    private JButton cerrarTodo;
    private OyenteNuevo oyenteNuevo;

    public LaminaAccion() {
        nuevo = new JButton("Nuevo");
        add(nuevo);
        cerrarTodo = new JButton("Cerrar todo");
        add(cerrarTodo);
        oyenteNuevo = new OyenteNuevo();
        nuevo.addActionListener(oyenteNuevo);

    }

    // Inner Class OyenteNuevo implementa el Interfaz ActionListener y está a la
    // exucha del objeto Fuente (botón "Nuevo").
    private class OyenteNuevo implements ActionListener {

        private MarcoNuevo nuevoMarco;

        @Override
        public void actionPerformed(ActionEvent e) {
            nuevoMarco = new MarcoNuevo(cerrarTodo);
        }

    }

}

//Class que permite crear marcos nuevos cada vez que pulso el botón "Nuevo".
class MarcoNuevo extends JFrame {

    static int contadorMarcos = 0;
    private OyenteBotonCerrarTodos oyenteBotonCerrarTodos;

    public MarcoNuevo(JButton boton) {
        setTitle("Nuevo marco: " + contadorMarcos++);
        setBounds(50 + contadorMarcos * 10, 50 + contadorMarcos * 10, 300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        oyenteBotonCerrarTodos = new OyenteBotonCerrarTodos();
        boton.addActionListener(oyenteBotonCerrarTodos);

    }

    // Clase interna dentro de la clase MarcoNuevo. La vamos a utilizar para
    // implementar el Oyente del botón "CerrarTodo"
    private class OyenteBotonCerrarTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }

    }

}
