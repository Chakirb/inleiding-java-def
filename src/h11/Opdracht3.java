package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
        setSize(400,400);
    }

    public void paint(Graphics g) {
        int x = 0;
        int ert1 = 0;
        int ert2 = 1;
        int som = ert1 + ert2;


        for(int teller=0; teller<20; teller++){
            x += 20;
            g.drawString(som + "",50,x);
            ert1 = ert2;
            ert2 = som;
            som = ert1 + ert2;
        }

    }
}
