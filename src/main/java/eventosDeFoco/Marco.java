package eventosDeFoco;

import javax.swing.*;

public class Marco extends JFrame {

    //Clase Marco. En el constructor del marco creamos un objeto lámina y lo añadimos al marco.
    //Posteriormente, cuando dibujemos los cuadros texto JTextField, los añadiremos sobre la lámina .
    private Lamina miLamina = new Lamina();

    public Marco(){
        setVisible(true);
        setBounds(300, 300, 600, 450);
        setTitle("Pruebas con cambio de foco en componentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(miLamina);
    }
    
}
