package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(75, 125, 125, 125);
        g.drawLine(75, 125, 100, 100);
        g.drawLine(100, 100, 125, 125);
    }
}