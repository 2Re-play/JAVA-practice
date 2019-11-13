package class08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {

    public IndepClassListener () {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane(); //도화지 가져오기
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("action");
        btn.addActionListener(new MyActionListener()); // btn 버튼에게 액션리스너 추가
        setSize(300, 400);
        setVisible(true);
        c.add(btn);
    }

    public static void main (String[] args) {
        IndepClassListener mf = new IndepClassListener();
    }
    private class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource(); // 이벤트의 대상을 가져옴
            if(b.getText().equals("action")) {
                b.setText("액션");
            } else {
                b.setText("action");
            }
        }

    }
}

// 이벤트 리스너 클래스를 독립적으로 만들자!
// 내부 클래스로
