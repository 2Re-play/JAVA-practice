package class08;

import javax.swing.*;
import java.awt.*;

public class GamblingGameFrame extends JFrame {

    public GamblingGameFrame () {
        setTitle("짹팟 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
        setContentPane(new GamePanel());
        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }

    // inner class
    private class GamePanel extends JPanel {
        private JLabel[] label = new JLabel[3];
        private JLabel message = new JLabel("시작합니다.");
        public GamePanel () {
            // 배치 관리자
            setLayout(null);
            for(int i=0; i<label.length; i++) {
                label[i] = new JLabel("0");
                label[i].setSize(60,30);
                label[i].setLocation(40+80*i, 60 );
                label[i].setBackground(Color.magenta);
                label[i].setForeground(Color.yellow);
                label[i].setFont(new Font("맑은고딕", Font.ITALIC, 25));
                add(label[i]);
            }
            message.setSize(20, 30);
            message.setLocation(120, 120);
            add(message);
        }
    }

    public static void main (String [] args) {
        GamblingGameFrame gamblingGameFrame = new GamblingGameFrame();
    }
}
