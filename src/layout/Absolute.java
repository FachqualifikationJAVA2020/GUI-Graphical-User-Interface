package layout;

import javax.swing.*;
import java.awt.*;

public class Absolute {
    /*
     *  Erlaubt mir Pixelgenau jede GUI-Komponente anzuordnen
     */

    private JFrame frame;
    private JLabel label;
    private JTextField eingabe;
    private JButton button;

    public Absolute(){
        frame = new JFrame();

        label = new JLabel("Label");
        eingabe = new JTextField(10);
        button = new JButton("Klick");

        //  AbsoluteLayout wird auch als nullLayout bezeichnet
        frame.setLayout(null);

        /*
         *  Alle größe aller Komponenten, die vorher vom LayoutManager
         *  gesetzt hat, muss jetzt von Hand gesetzt werden
         */
        frame.setSize(300,400);
        label.setSize(80,150);
        label.setLocation(0,0);

        eingabe.setSize(150,80);
        eingabe.setLocation(150,100);


        frame.add(label);
        frame.add(eingabe);
        frame.add(button);

        //  Wichtige Eigenschaften
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Absolute();
    }
}
