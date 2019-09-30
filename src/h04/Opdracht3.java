package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void paint(Graphics g) {
        //stok
        g.setColor(Color.black);
        g.fillRect(30, 85, 20, 310);

        // de vlag
        g.setColor(Color.red);
        g.fillRect(30, 70, 110, 40);
        g.setColor(Color.white);
        g.fillRect(30, 105, 110, 40);
        g.setColor(Color.blue);
        g.fillRect(30, 135, 110, 40);




    }

}