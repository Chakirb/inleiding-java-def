import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    TextField tv;
    boolean firstNumber;
    int maxInput;
    int userInput;
    String sorry;

    public void init() {
        tv = new TextField(20);
        tv.addActionListener(new Tekstlistener());
        add(tv);
        maxInput = 0;
        firstNumber = true;
        sorry = "";

    }

    public void paint(Graphics g) {
        g.drawString("hoogste getal: " + maxInput, 50, 100);
        g.drawString(sorry, 50, 160);

    }


    class Tekstlistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            String userInputString = tv.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput) {
                    maxInput = userInput;
                    sorry = "";
                    repaint();

                }
            }
        }
    }
}