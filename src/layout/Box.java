package layout;

import javax.swing.*;
import java.awt.*;

public class Box {
    /*
     *  Erlbaut mehrere Elemente in einer Zeile
     *  oder einer Spalte anzuordnen
     */

    private JFrame frame;
    private JLabel label;
    private JTextField eingabe;
    private JButton button;

    public Box(){
        frame = new JFrame();

        label = new JLabel("Label");
        eingabe = new JTextField(10);
        button = new JButton("Klick");

        /*
         *  Layout festlegen
         *
         *  Zuerst muss die Komponente angegeben werden, auf die das Layout wirken soll
         *  speziell hier das ContentPane unseres frame
         *  Es kann nicht der ganze frame angegeben werden
         *
         *  Zweiter Parameter ist die Ausrichtung der Box
         *
         * X_AXIS   = entlang der X-Achse | waagerechte Box
         * Y_AXIS   = entlang der Y-Achse | senkrechte Box
         */
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));

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
        new Box();
    }
}
