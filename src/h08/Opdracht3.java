package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    TextField tekstvak;
    Button OK;
    double som;
    double cijfer;
    double antwoord;

    public void init() {

        cijfer = 0;

        setSize(400, 400);

        tekstvak = new TextField(cijfer + "", 20);
        double cijfer = Double.parseDouble(tekstvak.getText());
        tekstvak.setEditable(true);
        add(tekstvak);

        OK = new Button("OK");
        OK.addActionListener(new Opdracht3.OKlistener());
        add(OK);
    }

    public void paint(Graphics g) {

        g.drawString("typ een antwoord ", 50, 150);

    }

    class OKlistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double input = Double.parseDouble(tekstvak.getText());

            som = input / 100;
            antwoord = som * 21;
            antwoord = antwoord + input;
            System.out.println(antwoord);
            tekstvak.setText(antwoord + "");
            repaint();
        }
    }

}
