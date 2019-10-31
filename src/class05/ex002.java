package class05;

class SuperObject {

    public void paint () {
        System.out.println("Super paint");
        draw();
    }
    public void draw () {
        draw();
        System.out.println("Super draw");
        System.out.println("Super Object");
    }
}
class SubObject extends SuperObject {

    @Override
    public void paint (){
        super.draw();
        System.out.println("Sub paint");
    }

    @Override
    public void draw () {
        System.out.println("sub draw");
        System.out.println("Sub Object");
    }
}
public class ex002 {

        public static void main(String[ ] args) {
            SuperObject b = new SubObject(); // 업캐스팅
            b.paint();

        }

    }
