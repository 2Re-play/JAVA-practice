package class02;

public class TypeConversion {

    public static void main (String [] args){
        byte b = 127;
        int i = 100;
        System.out.println("b = "+ b);
        System.out.println("i = "+ i);
        System.out.println(b+i); // 자동(묵시적) 형변환 byte와 int가 만나면 int로 형변환 된다.
        System.out.println(10/4); // 정수/정수=정수로 return
        System.out.println(10.0/4); // 실수/정수 = 실수로 return, 자동형변환
        System.out.println((char)0x12340041); // 16진수를 char로 강제 형변환, casting
        System.out.println((byte)(b+i)); // byte가 날라갔거나, 227이란 수를 32비트로 표현한 후에 8비트로 잘랐을 때 앞자리가 1이 나와서 부호가 -가 됌
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
