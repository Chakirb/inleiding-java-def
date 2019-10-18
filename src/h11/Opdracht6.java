package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init(){
        setSize(400,400);


    }
    public void paint(Graphics g){

        int y = 200;
        int x = 200;
        int dikte=20;
        int hoogte=20;
        int teller=0;

        while(teller<5){

            dikte+=20;
            hoogte+=20;

            y-=10;
            x-=10;
            teller++;

            g.drawOval(y,x,dikte,hoogte);
        }

    }
}
