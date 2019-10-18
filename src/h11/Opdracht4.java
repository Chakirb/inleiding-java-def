package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {


        int teller = 0;

        int y = 0;

        while (teller < 30) {


            y+=20;


            teller += 3;

            g.drawString(teller + "", 60, y);

        }
    }
}
