package layout;

import javax.swing.*;
import java.awt.*;


public class Flow {
    /*
     *  Das FlowLayout erlaubt mehrere Elemente nebeneinander anzuordnen
     */

    private JFrame frame;
    private JLabel label;
    private JTextField eingabe;
    private JButton button;

    public Flow(){
        frame = new JFrame();

        label = new JLabel("Label");
        eingabe = new JTextField(10);
        button = new JButton("Klick");

        //  Layout festlegen
        frame.setLayout(new FlowLayout());

        //  Komponenten hinzufügen
        frame.add(label);
        frame.add(eingabe);
        frame.add(button);

        //  MINIMALE Fenster Größe
        frame.setMinimumSize(new Dimension(200,500));

        //  Wichtige Eigenschaften
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Flow();
    }

}
