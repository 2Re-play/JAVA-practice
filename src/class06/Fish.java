package class06;

public class Fish extends GameObject {

    public Fish (int x, int y, int distance){
        super(x, y, distance);
    }

    public void move () {
        int n = (int)(Math.random()*5); // int로 0~4 난수 발생
        switch (n){
            case 0 : x += distance; // fish의 이동거리는 1
                break;
            case 1 : x -= distance;
                break;
        }
        if(x < 0) x=0;
        if(x>19) x = 19;

        n = (int)(Math.random()*5); // int로 0~4 난수 발생
        if(n == 0) y += distance;
        else if (n == 1) y -= distance;

        if(y<0) y = 0;
        if(y>10) y = 9;
    }

    public char getShape () {
        return '@';
    }

}
