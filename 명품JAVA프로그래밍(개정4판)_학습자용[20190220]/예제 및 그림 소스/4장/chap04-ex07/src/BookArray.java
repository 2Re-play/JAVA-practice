import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String author) { // ������
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2]; // BookArray �迭 ����
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) { // book.length = 2
			System.out.print("����>>");
			String title = scanner.nextLine();
			System.out.print("����>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author); // �迭 ���� ��ü ����
		}
		
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");

		scanner.close();
	}
}