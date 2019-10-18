package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
        ;
        setSize(600, 600);



    }

    public void paint(Graphics g) {

        int y = 0;
        int x = 20;

        while (y < 200) {

            y += 40;
            x += 40;
            g.drawRect(y,x, 40, 40);
        }
    }
}
