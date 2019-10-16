//package class05;
//
//
//class Shape {
//
//    public void paint() {
//        draw();
//    }
//
//    public void draw () {
//        System.out.println("Shape");
//    }
//}
//
//class Line extends Shape {
//    public void draw () {
//        System.out.println("Line");
//    }
//}
//
//class Rect extends Shape {
//    public void draw () {
//        System.out.println("Rect");
//    }
//}
//
//class Circle extends Shape {
//    public void draw () {
//        System.out.println("Circle");
//        super.draw(); // 상위 클래스 메소드 호출
//    }
//}
//
//public class methodOverrideEx {
//
//    static void paint (Shape p) {
//        p.draw(); // 동적 바인딩
//    }
//
//    public static void main (String [] args){
////        Line line = new Line();
//
////        paint(line); // 업캐스팅, 부모타입의 p 변수에 자식 객체 line이 들어가기 때문에 upCasting
////        paint(new Shape()); // 업캐스팅 상황에서 자식의 메소드가 호출된다.
////        paint(new Line());
////        paint(new Rect());
////        paint(new Circle());
//
//          Shape b = new Circle(); // 업캐스팅
//          Shape a = new Rect();
//          b.paint();
//          a.paint();
//    }
//}
