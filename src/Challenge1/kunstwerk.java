package Challenge1;

import java.applet.Applet;
import java.awt.*;

public class kunstwerk extends Applet {



    public void paint(Graphics g) {


        //lijnen

        g.drawRect(600,300,600,600);
        g.setColor(Color.black);
        g.fillRect(600, 300, 155,135);
        g.drawLine(700,8 ,400,350);

        g.fillRect(300,250,125, 230);





    }
}
