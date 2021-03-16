package layout;

import javax.swing.*;
import java.awt.*;

public class Grid {
    /*
     *  Erlaubt Elemente in Zeilen und Spalten
     *  in einem Gitter anzuordnen
     */

    private JFrame frame;
    private JLabel label;
    private JTextField eingabe;
    private JButton button;

    public Grid(){
        frame = new JFrame();

        label = new JLabel("Label");
        eingabe = new JTextField(10);
        button = new JButton("Klick");

        /*
         *  Layout festlegen
         *  Gridlayout kann Zeilen und Spalten erzeugen,
         *  die Anzahl gebe ich im Konstruktor an
         */
        frame.setLayout(new GridLayout(2,2));

        //  Komponenten hinzufügen
        frame.add(label);
        frame.add(eingabe);
        frame.add(button);

        //  Wichtige Eigenschaften
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Grid();
    }
}
