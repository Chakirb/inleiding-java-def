import javafx.scene.layout.Background;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    Color opvulkleur;

     public void init() {
         opvulkleur = Color.yellow;
     }



    public void paint(Graphics g) {
        g.setColor(opvulkleur);
         setBackground(Color.blue);
     g.fillOval(50, 50, 100, 200);



    }


}