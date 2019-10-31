package class06;

import java.util.Scanner;

public class Bear extends GameObject {
    // Bear 클래스만의 속성이 없는 상태
    Scanner sc;

    public Bear (int x, int y, int distance){
        super(x, y, distance);
        sc = new Scanner(System.in);
    }

    public void move () {
        System.out.println("왼쪽(a), 아래(s), 위(w), 오른쪽(d)");
        char input = sc.next().charAt(0);
        switch (input){
            case 'a' : y--;
                if(x < 0) x = 0;
                break;
            case 's' : x++;
                if(y > 9) y = 9;
                break;
            case 'w' : x--;
                if(y<0) y = 0;
                break;
            case 'd' : y++;
                if(x>19) x = 19;
                break;
        }
    }


    public char getShape () {
        return 'B';
    }
}
