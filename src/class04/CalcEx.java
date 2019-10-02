package class04;

class Calc {

    public static int abs (int a) {
        return (a>0) ? a : -a;
    }

    public static int max (int a, int b) {
        return (a>b) ? a : b;
    }

}

public class CalcEx {

    public static void main (String[] args) {
        System.out.println(Calc.max(7, 3));
        Calc cal = new Calc();
        int ret = cal.abs(-10);
        System.out.println("-10의 절댓값" + ret);
        ret = cal.max(5, 10);
    }
}
