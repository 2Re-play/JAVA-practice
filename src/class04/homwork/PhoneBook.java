package class04.homwork;

import java.util.Scanner;

public class PhoneBook {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("인원수>>");
        int count = sc.nextInt();
        Phone[] phone = new Phone[count];

        for (int i = 0; i < count; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String phoneNumber = sc.next();
            phone[i] = new Phone(name, phoneNumber);
        }

        System.out.println("저장되었습니다...");
        int j;

        while(true) {
            System.out.print("검색할 이름 >>");
            String name = sc.next();
            for( j=0; j<count; j++) {
                if(name.equals(phone[j].getName())) {
                    System.out.println(name+"의 번호는 "+phone[j].getPhoneNumber()+" 입니다.");
                    j--;
                    break;
                }
            }
            if(name.equals("그만")) break;
            if (j == count) System.out.println(name+"이 없습니다.");
        }

        sc.close();
    }
}
