package class03;

import java.util.Scanner;

class Book {
    String title, author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class BookArray {

    public static void main(String[] args){
        //객체배열 선언과 생성
        Book[] book = new Book[2];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<book.length; i++) {
            System.out.println("제목>>");
            String title = sc.nextLine();
            System.out.println("저자이름>>");
            String author = sc.nextLine();
            book[i] = new Book(title, author);
        }
        for(int i=0; i<book.length; i++) {
        System.out.println("title : "+ book[i].title + "author : " + book[i].author);
        }
        sc.close();
    }
}
