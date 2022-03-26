package graficos.estadoVentana;
import javax.swing.*;

public class ObjetoFuenteMarco extends JFrame {

    public ObjetoFuenteMarco(){
        setVisible(true);

        //Instanciamos un objeto oyente.
        ObjOyenteDeCambioEstadoVentana oyente = new ObjOyenteDeCambioEstadoVentana();

        //hacemos que el objeto fuente esté a la escucha de los eventos de cambio de estado de ventana.
        addWindowStateListener(oyente);
    }
    
}
