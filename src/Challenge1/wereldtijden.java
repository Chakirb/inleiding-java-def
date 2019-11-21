package Challenge1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wereldtijden extends Applet {

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
                    tekst = "Tijd in Londen";
                    break;
                case 2:
                    tekst = "Tijd in Tokyo";
                    break;
                case 3:
                    tekst = "New York";
                    break;
                case 4:
                    tekst = "Sydney";
                    break;
                case 5:
                    tekst = "";
                    break;
                case 6:
                    tekst = "";
                    break;
                case 7:
                    tekst = "";
                    break;
                case 8:
                    tekst = "";
                    break;
                case 9:
                    tekst = "";
                    break;
                case 10:
                    tekst = "";
                    break;
                case 11:
                    tekst = "";
                    break;
                case 12:
                    tekst = "";
                    break;
                default:
                    tekst = "";
                    break;
            }
            repaint();

        }
    }
}




