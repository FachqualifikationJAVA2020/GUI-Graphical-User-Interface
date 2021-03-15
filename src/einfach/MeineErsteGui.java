package einfach;

/*
 *  GUI = Graphical User Interface
 *      = Grafische Benutzter Oberfläsche
 *
 *  Swing ist das am weitestens verbreitete Java-GUI-Paket
 *  (nicht das neuste)
 *  Alle Swing.Klassen fangen mit einem "J" an
 *
 */
import javax.swing.*;

/*
 *  LayoutManager ist im Package java.awt.LayoutManager
 *  Das ist das GUI-System vor Swing
 *  awt = Abstract Windows Toolkit
 */
import java.awt.*;

public class MeineErsteGui extends JFrame {

    public MeineErsteGui() {
        /*
         *  Ein JFrame hat ein Icon, eine Zeile Bedienelemente
         *  für Fenster und einen Rahmen - sonst nichts
         *  Das Aussehen des JFrames passt sich dem Betriebssystem an
         */

        //  Gibt die Größe in Pixel an: breite,höhe
        this.setSize(300,400);

        //  Setzt die Position beim Start von der oberen Linken ecke: X,Y
        this.setLocation(200,100);

        //  Setzt den Title vom JFrame
        this.setTitle("Meine erste GUI");

        /*
         *  Um das Programm über die GUI zu beenden
         *  EXIT_ON_CLOSE       = Schließt das JFrame und beendet das Programm
         *  HIDE_ON_CLOSE       = Standard die nur das JFrame unsichtbar macht setVisible(false)
         *  DISPOSE_ON_CLOSE    = Schließt das Fenster und löscht die enthaltene Elemente
         *                        Macht den Speicher frei, zum Wiederanzeigen müsste alles neu erzeugt werden
         *  DO_NOTHING_ON_CLOSE = Macht einfach nichts
         */
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //  Elemente auf dem JFrame anzeigen
        JLabel text = new JLabel("Mein erstes Element");

        /*
         * Komponente dem JFrame hinzufügen
         * JLabel haben ihren Text am linken Rand und werden mittig im bestehenden Bereich platziert
         */
        this.add(text);

        //  Komponente hinzufügen
        JButton klick = new JButton("Klick");
        this.add(klick);

        /*
         *  Der Button nutzt die ganze Fläche als Buttonfläche
         *  die Beschriftung ist horizontal und vertikal zentriert
         *
         *  Das JLabel ist nicht mehr sichtbar
         *
         *  -> Aktuell hat das JFrame nur Platz für eine Komponente
         *
         *  Um meherere Komponenten/Elemente anzuzeigen benötigen wir ein Layout
         *
         *  BorderLayout definiert 5 Bereiche im Fenster an denen Komponenten
         *  abgelegt werden können
         *
         *       BORDERLAYOUT
         *
         *          [NORTH]
         *    [WEST][CENTER][EAST]
         *          [SOUTH]
         *
         *  Sobald ein LayoutManager hinzugefügt wird, werden alle VORHER hinzugefügte
         *  Komponenten ignoriert und sind obsolet
         *
         */
        LayoutManager lm = new BorderLayout();
        //  LayOut an das JFrame binden
        this.setLayout(lm);

        //  Komponente Anordnen
        this.add(klick, BorderLayout.SOUTH);
        this.add(text,BorderLayout.NORTH);
        /*
         *  NORTH   = oben, PAGE_START
         *  SOUTH   = unten, PAGE_END
         *  WEST    = links, LINE_START
         *  EAST    = rechts, LINE_END
         *  CENTER  = mitte
         */

        //  Komponente hinzufügen & Anordnen
        JTextField eingabe = new JTextField();
        //  CENTER füllt den ganzen Bereich zwischen NORTH und SOUTH
        this.add(eingabe, BorderLayout.CENTER);

        // Um das Fenster sichtbar zu machen | zuletzt ausführen wenn alles geladen wird
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new MeineErsteGui();

    }
}
