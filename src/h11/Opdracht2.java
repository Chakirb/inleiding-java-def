package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int x = 0;

        for (int teller=20; teller>9; teller--) {

            x+=20;
            g.drawString(teller+ "", 50,x);
        }




    }
}
