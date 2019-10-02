package class03;

import javax.swing.*;
import java.awt.*;

public class PaintJpanelEx extends JFrame {

    private MyPanel panel = new MyPanel();

    public PaintJpanelEx() {
        setTitle("예제");
        setContentPane(panel);
        setSize(250, 230);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent (Graphics graphics){
            graphics.setColor(Color.blue);
            graphics.drawRect(10,10,50,50);

        }
    }

    public static void main (String[] args){
        new PaintJpanelEx();

    }
}
