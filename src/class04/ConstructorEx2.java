package class04;

class A1 {
    int x;
    public A1 () {
        x = 1;
        System.out.println("생성자A");
    }
    public A1 (int x) {
        this.x = x;
        System.out.println("생성자A + 매개변수");
    }
}

class B1 extends A1 {
    int y;
    public B1 () {
        super(5); // super 명령어를 통해 매개변수가 있는 생성자를 호춣한다.
        y = 2;
        System.out.println("생성자B");
    }
}

class C1 extends B1 {
    int z;
    public C1 () {
        // field 초기화
        z = 3;
        System.out.println("생성자C");
    }
    public C1 (int z) {
        this.z = z;
        System.out.println("생성자C + 매개변수");
    }
}

public class ConstructorEx2 {
    public static void main (String[] args) {
//        A obja = new A();
//        B objb = new B();
        C1 objc2 = new C1(30);


//
//        C1 objc = new C1();
//        System.out.println(objc.x);
//        System.out.println(objc.y);
//        System.out.println(objc.z);
    }
}
