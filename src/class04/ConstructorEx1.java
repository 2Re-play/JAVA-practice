package class04;

class A {
    public A () {
        System.out.println("생성자A");
    }
}

class B extends A {
    public B () {
        System.out.println("생성자B");
    }
}

class C extends B {
    public C () {
        System.out.println("생성자C");
    }
}

public class ConstructorEx1 {

    public static void main (String [] args){
//        A obja = new A();
//        B objb = new B();
        C objc = new C();

    }
}
