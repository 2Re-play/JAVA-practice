package class06;

class GameManager {
    // 좌판생성 (10 x 20)
    char map[][] = new char[10][20];
    // 객체생성을 위한 배열
    GameObject [] m = new GameObject[2];

    public GameManager () {
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++){
                map[i][j] = '-';
            }
        }
        m[0] = new Bear(0,0, 1);
        m[1] = new Fish(5,10, 1);
    }

    boolean gameEnd () {
        if(m[0].getX() == m[1].getX() && m[1].getY() == m[0].getY()){
            return true;
        }else {
            return false;
        }
    }

    void gameStart () {
        System.out.println("game start!\n");
        update();
        display();
        while(!gameEnd()){
            clear();
            for(int i=0; i<m.length; i++){
                m[i].move();
            }
            update();
            display();
        }
    }

    void update () {
        for(int i=m.length-1; i>=0; i--){
            int x = m[i].getX();
            int y = m[i].getY();
            map[x][y] = m[i].getShape();
        }
    }
    void clear () {
        for(int i=m.length-1; i>=0; i--){
            int x = m[i].getX();
            int y = m[i].getY();
            map[x][y] = '-';
        }
    }

    void display () {
        for(int i=0; i<10; i++) {
            for (int j = 0; j < 20; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }
}

public class MonsterGame {

    public static void main (String[] args) {
        GameManager gm = new GameManager();
        gm.gameStart();
    }
}
