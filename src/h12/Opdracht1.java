package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    int[] getallen = {10, 12, 14, 16, 18, 20, 22, 24 ,26, 10};
    double gemmidelde = 0;

    public void init() {

        int totaal = 0;
        int aantal = 0;


        for (int i= 0; i < getallen.length; i++) {
            int getal = getallen[i];
            totaal = totaal + getal;
            aantal++;


            gemmidelde = totaal / aantal;


        }
    }

    public void paint(Graphics g) {

        g.drawString(gemmidelde + " gemiddelde ", 100, 100);

        g.drawString (  "aantal getallen"+getallen.length, 100 ,20);

    }



}
