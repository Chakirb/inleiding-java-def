package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "jan heeft 31 dagen";
                    break;
                case 2:
                    tekst = "feb heeft 28 dagen";
                    break;
                case 3:
                    tekst = "mrt heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "jun heeft 30 dagen";
                    break;
                case 7:
                    tekst = "jul heeft 31 dagen";
                    break;
                case 8:
                    tekst = "aug heeft 30 dagen";
                    break;
                case 9:
                    tekst = "sep heeft 31 dagen";
                    break;
                case 10:
                    tekst = "okt heeft 30 dagen";
                    break;
                case 11:
                    tekst = "nov heeft 31 dagen";
                    break;
                case 12:
                    tekst = "dec heeft 30 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}
