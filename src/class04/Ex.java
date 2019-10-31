package class04;

class StaticSample {
    public int n;
    public static int m; // 객체에서 공유됨, static은 전역변수와 유사하다.

    public  void g () { // static 키워드가 없다면 일반 멤버함수, 객체가 생성되어야 호출 가능함
        m = 20;
    }
    public void h () {
        m = 30;
    }
    public static void f () { // 객체 생성없이 사용 가능한 static 메소드
        m = 30;
//        n = 3; static method는 할당되기 이전의 필드를 사용할 수 없음.
    }
}



public class Ex {

    public static void main (String [] args){
        StaticSample.f(); // 클래스 이름으로 static method를 사용할 수 있다.
        System.out.println("static m = " + StaticSample.m); // 클래스 이름으로 static에 접근한다.
        StaticSample s1 = new StaticSample(); // 참조 변수 s1, s2

        s1.n = 5;
        s1.g();
        s1.m = 50;

        StaticSample s2 = new StaticSample();
        s2.m = 8;
        s2.h();
        s2.f();
        System.out.println(s1.m);
        System.out.println(s2.m);
        System.out.println(s1.n); // 객체마다 존재하는 멤버 필드
        System.out.println(s2.n); // 객체마다 존재하는 멤버 필드
    }
}
