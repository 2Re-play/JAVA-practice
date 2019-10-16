package class04;

class Person {
    String name;
    String id;
    public Person (String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    public Student (String name) {
        super(name);
    }
}
public class UpcastingEx {

    public static void main (String [] args) {
        Person p; // person 타입의 참조변수 p 선언
        Student s = new Student("황기태");

        /* 업캐스팅 */
        p = s; // 업캐스팅, 묵시적 형변환
        System.out.println(p.name);
        //p.grade = "a"; // 불가능

        /* 다운캐스팅 */
//        ((Student) p).grade = "a";
        s = (Student) p;
        s.grade = "a";
        System.out.println(s.grade);
    }
}
