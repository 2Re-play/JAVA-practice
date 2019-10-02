package class03;

public class ArrayPassingEx {
    static void replace (char a[]){ // 주소가 전달, 메모리 공유
        for(int i=0; i<a.length; i++){
            if(a[i] == 'i'){
                a[i] = 'v';
            }
        }
    }

    static void printCharArray(char a[]){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
    }

    static int getSum(int i , int j){
        return i+j;
    }

    static int getSum(int a){ // method overroading
        return a+10;
    }

    public static void main(String[] args){
        char c[] = {'t','h', 'i', 's', 'i', 's', 'p', 'e', 'n'};
        printCharArray(c); // 레퍼런스 주소 전달
        replace(c);
        printCharArray(c);
        System.out.println(getSum(10));
        System.out.println(getSum(10,20));
    }

}
