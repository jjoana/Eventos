package layoutsI;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {

    private Lamina miLamina;

    public Marco(){

        setTitle("Mi marco con Layout");
        setBounds(600, 350, 600, 300);
        miLamina = new Lamina();
        add(miLamina);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
      
    private class Lamina extends JPanel {

        private JButton amarillo;
        private JButton rojo;
        private JButton azul;
        private JButton verde;
        private JButton negro;
    
        public Lamina(){
    
            amarillo = new JButton("Amarillo");
            rojo = new JButton("Rojo");
            azul = new JButton("Azul");
            verde = new JButton("Verde");
            negro = new JButton("Negro");
            FlowLayout flayout;     
            
            //Establezcemos el Layout que queremos utilizando el primer contructor de FlowLayout
            //flayout = new FlowLayout(FlowLayout.CENTER);

            //Establezcemos el Layout que queremos utilizando el segundo contructor de FlowLayout
            flayout = new FlowLayout(FlowLayout.CENTER, 20, 20);
            
            //Establecemos el layout deseado a la lámina
            setLayout(flayout);

            //Se añaden los botones a la lámina
            add(amarillo);
            add(rojo);
            add(azul);
            add(verde);
            add(negro);                       

        }
        
    }


}
