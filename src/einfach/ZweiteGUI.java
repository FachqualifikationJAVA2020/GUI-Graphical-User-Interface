package einfach;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZweiteGUI implements ActionListener {
    /*
     *  Zweite GUI erbt nicht mehr direkt von JFrame
     *
     *  Komponenten können auch in Felder abgelegt werden
     */

    private JFrame frame;
    private JTextField eingabe;
    private JButton button;
    private JLabel label;

    //  Konstruktor
    public ZweiteGUI(){
        // Frame
        frame = new JFrame();
        frame.setTitle("Meine Zweite GUI");
        frame.setLocation(100,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Komponenten hinzufügen
        eingabe = new JTextField(10);
        button = new JButton("Bitte hier klicken");
        label = new JLabel("Text");

        //  LayoutManager
        frame.setLayout(new BorderLayout());

        // Komponenten Andordnen
        frame.add(eingabe, BorderLayout.EAST);
        frame.add(label, BorderLayout.WEST);
        frame.add(button, BorderLayout.SOUTH);

        /*
         *  ActionListener dem Button hinzufügen
         *
         *  Mit der addActionlistener()-Methode wird eine Instanz
         *  einer Klasse, die ActionListener implementiert an den
         *  Button gehängt
         *  Wenn eine Aktion am Button ausgeführt wird,
         *  reagiert die Klasse mit der actionPerformed()-Methode
         *
         */
        button.addActionListener(this);

        //  Frame Größe an Inhalt anpassen
        frame.pack();

        //  Frame sichtbar machen
        frame.setVisible(true);
    }


    //  Die main-Methode erzeugt nur eine Instanz
    public static void main(String[] args) {
        new ZweiteGUI();
    }

    /*
     *  ActionListener Methode für Button-Events z.B. beim Klick Text ändern
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        /*
         *  Auslesen des Text aus dem JTextField
         *
         *  .getText() kann nur Strings auslesen
         */
        String s = eingabe.getText();

        //  Aus String ein int machen
        int i = Integer.parseInt(s);
        i = i * 2;

        //  Leeren vom JTextField
        eingabe.setText("");

        //  Text ins JLabel schreiben
        label.setText(String.valueOf(i));

    }
}
