package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianATYv2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public void printLibrarian ( Library library)
	{
		
		Book[] book = library.getBooks();
		
		System.out.print("Введите фамилию автора: ");
		String author = scan.nextLine();
		
		System.out.print("Введите название произведения: ");
		String title = scan.nextLine();
		
		System.out.print("Введите год издания: ");
		int year = scan.nextInt();
		
		for ( int i = 0; i < book.length; i++)
		{
			if ( author.equals(book[i].getAuthor().getLastName()) 
					&& title.equals(book[i].getTitle()) 
					&& year == book[i].getYear())
			{
				System.out.println("Автор: " + book[i].getAuthor().getLastName() + " " 
						+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
						"\t" + " Название:  " + book[i].getTitle() + "\t" + " Год издания: " + book[i].getYear());
			}
		}
		System.out.println("====================================================================");
		
	}

}
