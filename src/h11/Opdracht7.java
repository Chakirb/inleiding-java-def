package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init(){
        setSize(800,800);


    }
    public void paint(Graphics g){

        int y = 500;
        int x = 500;
        int dikte=20;
        int hoogte=20;
        int teller=0;

        while(teller<50){

            dikte+=20;
            hoogte+=20;

            y-=10;
            x-=10;
            teller++;

            g.drawOval(y,x,dikte,hoogte);
        }

    }
}
