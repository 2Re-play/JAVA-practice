package class07;

import java.util.HashMap;
import java.util.Scanner;

class Student {
    private int id;
    private String tel;

    public Student (int id, String tel){
        this.id = id;
        this.tel = tel;
    }
    public int getId() {
        return id;
    }
    public String getTel() {
        return tel;
    }

}
public class HashMapStudent {

    public static void main (String[] args){
        HashMap<String, Student> map = new HashMap<String, Student>();
        map.put("이재현", new Student(1,"010-6687-3474"));
        map.put("황기태", new Student(2,"010-6687-3475"));
        map.put("강하늘", new Student(3,"010-6687-3476"));

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("검색할 키 값 입력 : ");
            String name = sc.nextLine();
            if("exit".equals(name)) break;
            Student student = map.get(name);
            if(student == null) {
                System.out.println(name + "은 없음.");
            } else {
                System.out.println("id = "+ student.getId() + " tel = " + student.getTel());
            }
        }
        sc.close();
    }
}
