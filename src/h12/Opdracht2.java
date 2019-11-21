package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    Button knop;

    public void init() {

    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < 25; teller++) {

            knop = new Button("knop");
            add(knop);



            g.drawString("" , 60, 50);

        }

    }
}
