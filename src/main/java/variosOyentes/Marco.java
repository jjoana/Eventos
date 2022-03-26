package variosOyentes;

import javax.swing.*;

public class Marco extends JFrame {

    LaminaAccion miLamina;

    public Marco(){
        setTitle("Pruebas con varios oyentes");
        setBounds(1330, 100, 300, 200);
        miLamina = new LaminaAccion();
        add(miLamina);
    }
    
}
