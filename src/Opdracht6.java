import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(80, 0, 150, 400);
        g.setColor(Color.red);
        g.fillOval(100, 10, 100, 100);
        g.setColor(Color.orange);
        g.fillOval(100, 150, 100, 100);
        g.setColor(Color.green);
        g.fillOval(100, 280, 100, 100);

    }
}