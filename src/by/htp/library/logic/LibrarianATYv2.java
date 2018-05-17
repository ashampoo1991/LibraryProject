package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianATYv2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public void printLibrarian ( Library library)
	{
		
		Book[] book = library.getBooks();
		
		System.out.print("������� ������� ������: ");
		String author = scan.nextLine();
		
		System.out.print("������� �������� ������������: ");
		String title = scan.nextLine();
		
		System.out.print("������� ��� �������: ");
		int year = scan.nextInt();
		
		for ( int i = 0; i < book.length; i++)
		{
			if ( author.equals(book[i].getAuthor().getLastName()) 
					&& title.equals(book[i].getTitle()) 
					&& year == book[i].getYear())
			{
				System.out.println("�����: " + book[i].getAuthor().getLastName() + " " 
						+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
						"\t" + " ��������:  " + book[i].getTitle() + "\t" + " ��� �������: " + book[i].getYear());
			}
		}
		System.out.println("====================================================================");
		
	}

}
