package layout;

import javax.swing.*;
import java.awt.*;

public class LayoutVerschachteln {
    /*
     *  Mehr als ein LayoutManager nutzen
     *  Jeder LayoutManager hat seinen eigenen Bereich
     *
     *  z.B.: kann am unteren Rand des Bildschirms eine
     *  Reihe Buttons sein
     */

    private JFrame frame;

    public LayoutVerschachteln(){
        frame = new JFrame();

        // Es soll etwas an den unteren Rand
        frame.setLayout(new BorderLayout());
        frame.add(new JTextField(10), BorderLayout.CENTER);

        /*
         *  Ein eigenes JPanel kann ein eigenen LayoutManager haben,
         *  hier um Buttons nebeneinander anzuordnen
         */
        JPanel buttonreihe = new JPanel();
        buttonreihe.setLayout(new BoxLayout(buttonreihe, BoxLayout.X_AXIS));
        buttonreihe.add(new JButton("1"));
        buttonreihe.add(new JButton("2"));
        buttonreihe.add(new JButton("3"));

        //  Dem frame die Buttonreihe hinzufügen
        frame.add(buttonreihe, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new LayoutVerschachteln();
    }


}
