package class04.homwork;

import java.util.Scanner;

public class Reserve {
    String seatType;
    String name;
    String seatNumber;

    public Reserve (String seatType, String name, String seatNumber){
        this.seatType = seatType;
        this.name = name;
        this.seatNumber = seatNumber;
    }

    private static void seatMenu(String input, Scanner sc, ConcertSeat concertSeat){
        String name;
        String seatNumber;

        switch (input){
            case "1" :
                System.out.println("S>> ");
                for(int i =0; i<concertSeat.s.length; i++){
                    System.out.print(concertSeat.s[i]+" ");
                }
                System.out.print("이름>> ");
                name = sc.nextLine();
                System.out.println("번호>> ");
                seatNumber = sc.nextLine();
                concertSeat.s[Integer.parseInt(seatNumber) - 1] = name;
                break;
            case "2" :
                System.out.println("A>> ");
                for(int i =0; i<concertSeat.a.length; i++){
                    System.out.print(concertSeat.a[i]+" ");
                }
                System.out.print("이름>> ");
                name = sc.nextLine();
                System.out.println("번호>> ");
                seatNumber = sc.nextLine();
                concertSeat.a[Integer.parseInt(seatNumber) - 1] = name;
                break;
            case "3" :
                System.out.println("B>> ");
                for(int i =0; i<concertSeat.b.length; i++){
                    System.out.print(concertSeat.b[i]+" ");
                }
                System.out.print("이름>> ");
                name = sc.nextLine();
                System.out.println("번호>> ");
                seatNumber = sc.nextLine();
                concertSeat.b[Integer.parseInt(seatNumber) - 1] = name;
                break;
        }


    }
    private static void currentSeat(ConcertSeat concertSeat){
        System.out.println("A>>");
        for(int j=0; j<concertSeat.a.length; j++){
            System.out.println(concertSeat.a[j]+ " ");
        }
        System.out.println("B>>");
        for(int j=0; j<concertSeat.a.length; j++){
            System.out.println(concertSeat.a[j]+ " ");
        }
        System.out.println("C>>");
        for(int j=0; j<concertSeat.a.length; j++){
            System.out.println(concertSeat.a[j]+ " ");
        }
    }

    private static void cancelSeat(ConcertSeat concertSeat, String cancelSeatNumber, Scanner sc){
        String cancelName;
        switch (cancelSeatNumber){
            case "1" :
                System.out.println("S>>");
                for(int j=0; j<concertSeat.s.length; j++){
                    System.out.println(concertSeat.s[j]+ " ");
                }
                System.out.print("이름>> ");
                cancelName = sc.nextLine();
                for (int k =0; k<concertSeat.s.length; k++){
                    if(concertSeat.s[k] == cancelName) {
                        concertSeat.s[k] = "---";
                    }
                }
                break;
            case "2" :
                System.out.println("A>>");
                for(int j=0; j<concertSeat.a.length; j++){
                    System.out.println(concertSeat.a[j]+ " ");
                }
                System.out.print("이름>> ");
                cancelName = sc.nextLine();
                for (int k =0; k<concertSeat.a.length; k++){
                    if(concertSeat.a[k] == cancelName) {
                        concertSeat.a[k] = "---";
                    }
                }
                break;
            case "3" :
                System.out.println("B>>");
                for(int j=0; j<concertSeat.b.length; j++){
                    System.out.println(concertSeat.b[j]+ " ");
                }
                System.out.print("이름>> ");
                cancelName = sc.nextLine();
                for (int k =0; k<concertSeat.b.length; k++){
                    if(concertSeat.b[k] == cancelName) {
                        concertSeat.b[k] = "---";
                    }
                }
                break;
        }

    }

    private static void firstMenu(String input, Scanner sc, ConcertSeat concertSeat){

        switch (input){
            case "1" :
                System.out.println("좌석 구분 S(1), A(2), B(3)>>");
                String seatType = sc.nextLine();
                seatMenu(seatType, sc, concertSeat);
                break;
            case "2" :
                currentSeat(concertSeat);
                break;
            case "3" :
                System.out.println("좌석 S(1), A(2), B(3)>>");
                String cancelSeatNumber = sc.nextLine();
                cancelSeat(concertSeat, cancelSeatNumber, sc);
                break;
        }
    }

    public static void main(String[] args) {

        ConcertSeat concertSeat = new ConcertSeat();

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4>>");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (input != "4"){
            firstMenu(input, sc, concertSeat);
        }
    }
}
