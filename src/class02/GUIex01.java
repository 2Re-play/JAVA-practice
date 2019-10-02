package class02;

import javax.swing.*;

public class GUIex01 {

    // 윈도우창을 띄워주는 클래스 생성
    public class MyFrame extends JFrame{
        // 클래스 = 속성(변수) + 동작코드(멤버함수,메소드)
        // 객체를 만들 때 호출하는 함수, 생성자 메소드
        public MyFrame(){
            setTitle("행복한 추석추석");
            setSize(300, 400);
            setVisible(true);
        }

    }

    public static void main(String [] args){
        // 첫번째 방법
        GUIex01 Gui = new GUIex01(); // 객체 생성
        GUIex01.MyFrame mf1 = Gui.new MyFrame();

        // 두번째 방법

    }
}

