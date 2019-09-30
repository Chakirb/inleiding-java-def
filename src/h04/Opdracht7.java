package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void paint(Graphics g) {
        g.drawRect(80, 80, 350, 350);
        g.setColor(Color.black);
        g.fillOval(100, 300, 100, 100);
        g.setColor(Color.black);
        g.fillOval(300, 150, 100, 100);
        g.setColor(Color.black);
        g.fillOval(300, 300, 100, 100);
        g.setColor(Color.black);
        g.fillOval(100, 150, 100, 100);

    }
}