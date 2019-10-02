package class02;


public class Circle {
    // field 객체의 특징
    // 접근제한자 public, pirvate, default, protected
    int radius;
    String name;

    // 생성자 메소드 - 객체 생성시 필요한 초기화를 수행한다.
    // 특징
    // 1. 클래스 이름과 같다.
    // 2. new 로 객체를 생성한다.
    // 3. 객체 생성 시 한 번만 실행된다.
    // 4. 객체 실행의 역순으로 종료된다.
    // 5. 접근 제한자가 없을 경우 default 접근제한자가 적용된다.
    // 6. 여러 개의 객체를 생성할 수 있다. (오버로딩, overloading)
    // 7. overloading - 매개변수의 타입과 갯수를 달리 해야한다.
    // 생성자 특징의 5개를 쓰시오. 등등 서술문제 2개 정도 나온다.
    Circle() {
        radius = 1;
        // System.out.println("나를 불렀음");
    }

    Circle(int r, String n){
        radius = r;
        name = n;
    }

    //메소드 - 멤버함수, 행위- 동작
    //리턴타입 함수이름(매개변수){}
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String [] args){

        // 객체 생성
        Circle pizza = new Circle(); // reference 변수, heap에 circle 객체를 생성하고 주소를 반환하며 레퍼런스 변수에 저장한다.
        Circle donut = new Circle(5,"donut");
        System.out.println("radius = "+ pizza.radius);
        // 객체의 멤버에 접근
        pizza.radius = 10;
        pizza.name = "hello";
        // 메서드 호출
        double area = pizza.getArea();
        System.out.println(area);
        System.out.println();
        System.out.println("donut 객체 이름 " + donut.name);
        System.out.println("donut 객체 반지름 " +donut.radius);
    }
}
