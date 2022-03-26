package layoutsII;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame{

    private LaminaFlow miLaminaFlow;
    private LaminaBorder miLaminaBorder;
    
    //Constructor del marco
    public Marco(){
        setTitle("Pruebas Marco con Layout II");
        setBounds(200, 200, 600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miLaminaFlow = new LaminaFlow();
        add(miLaminaFlow, BorderLayout.NORTH);
        miLaminaBorder = new LaminaBorder();
        add(miLaminaBorder, BorderLayout.CENTER);
    }

    private class LaminaFlow extends JPanel{

        JButton azul;
        JButton verde;

        public LaminaFlow(){

            // Es importante darse cuenta que este layout se establece para cada instancia de la lámina (se establece en el constructor)
            //Si quiero establece para el mismo contenedor otro layout distinto necesito definirlo para otra lámina
            FlowLayout layoutFlow;
            layoutFlow = new FlowLayout(FlowLayout.CENTER, 10, 10);
            setLayout(layoutFlow);
            azul = new JButton("Azul");
            verde = new JButton("Verde");
            add(azul);
            add(verde);
        }
    }
    
    private class LaminaBorder extends JPanel{

        JButton rojo;
        JButton negro;
        JButton amarillo;
        BorderLayout layoutBorder;

        public LaminaBorder(){

            // Es importante darse cuenta que este layout se establece para cada instancia de la lámina (se establece en el constructor)
            //Si quiero establece para el mismo contenedor otro layout distinto necesito definirlo para otra lámina.
            layoutBorder = new BorderLayout(5, 5);
            setLayout(layoutBorder);
            rojo = new JButton("Rojo");
            negro = new JButton("Negro");
            amarillo = new JButton("Amarillo");
            add(rojo, BorderLayout.WEST);
            add(negro, BorderLayout.EAST);
            add(amarillo, BorderLayout.CENTER);

        }
    } 
    
}
