package variasFuentes;

import javax.swing.*;

public class Marco extends JFrame {

    //Declaro e inicializo una variable de la clase LaminaAccion
    //Quiero poder acceder a ella desde cualquier método de esta clase así que la declaro fuera del constructor.
    private LaminaAccion miLamina = new LaminaAccion();

    public Marco(){
        setVisible(true);
        setTitle("Pruebas con acciones");
        setBounds(600, 350, 600, 300);
        add(miLamina);
    }

}
