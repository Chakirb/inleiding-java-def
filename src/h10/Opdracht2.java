package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class Opdracht2 extends Applet {
    TextField tv;
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;
    String sorry;

    public void init() {
        tv = new TextField(20);
        tv.addActionListener(new Tekstlistener());
        add(tv);
        maxInput = 0;
        minInput = 0;
        firstNumber = true;
        sorry = "";

    }
    public void paint(Graphics g) {
        g.drawString("Max input: " + maxInput, 50, 100);
        g.drawString("Min input: " + minInput, 50, 130);
        g.drawString(sorry, 50, 160);

    }








    class Tekstlistener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            String userInputString = tv.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            }else{
                if (userInput > maxInput) {
                    maxInput = userInput;
                    sorry = "";
                    repaint();
                } else if (userInput< minInput){
                    minInput = userInput;
                    sorry = "";
                    repaint();
                } else {
                    sorry = "sorry, maar " + userInput + " is niet hoger dan" + " is niet lager dan" + minInput;
                    repaint();
                }
            }

        }
    }
}
