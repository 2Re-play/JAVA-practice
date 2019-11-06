package class07;

import java.util.Iterator;
import java.util.Vector;

class Point {
    private int x, y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "( " + x +", "+ y + " )";
    }
}

public class VectorEx {
    // 439쪽, 연습문제 10
    public static void main (String [] args) {
        Vector<Point> vp = new Vector<Point>();
        vp.add(new Point(10, 20));
        vp.add(new Point(11, 21));
        vp.add(new Point(12, 22));

        vp.remove(1);

        for(int i=0; i<vp.size(); i++) {
            Point tmp = vp.get(i);
            System.out.println(tmp);
        }





        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2, 100);

        System.out.println("요소 수 = " + v.size());
        System.out.println("백터용량 = " + v.capacity());

        for(int i=0; i<v.size(); i++){
            int n = v.get(i); // 언박싱
            System.out.print(n + " ");
        }

        // iterator 활용
        Iterator<Integer> it = v.iterator();
        int n = it.next();
        System.out.println(n + " ");
    }
}
