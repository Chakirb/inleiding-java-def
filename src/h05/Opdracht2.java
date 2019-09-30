package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int JanGewicht;
    int PeterGewicht;
    int AppaGewicht;

    int hoogteXas;

    public void init() {

        setSize(900, 900);

        hoogteXas = 360;

        JanGewicht = 100;
        PeterGewicht = 300;
        AppaGewicht = 50;

    }


    public void paint(Graphics g) {
        // staven

        // jan
        g.setColor(Color.black);
        int hoogteXas = 350;
        g.fillRect(130, hoogteXas - JanGewicht, 50, JanGewicht);

        // peter
        g.setColor(Color.blue);
        g.fillRect(80, hoogteXas - PeterGewicht, 50, PeterGewicht);

        // appa
        g.setColor(Color.green);
        g.fillRect(180, hoogteXas - AppaGewicht, 50, AppaGewicht);


        g.setColor(Color.black);
        // verticale as
        g.drawLine(50, 100, 50, hoogteXas);

        // horizontale as
        g.drawLine(50, hoogteXas, 250, hoogteXas);


    }
}