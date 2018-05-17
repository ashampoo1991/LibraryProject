package by.htp.library.logic;


import java.util.Scanner;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianByTitle {
	
	static Scanner scan = new Scanner(System.in);
	
	public void printLibrarian ( Library library)
	{
		
		System.out.print("Введите название произведения: ");
		String title = scan.nextLine();
		
		Book[] book = library.getBooks();
		
		for ( int i = 0; i < book.length; i++)
		{
			if ( title.equals(book[i].getTitle()))
			{
				System.out.println("Автор: " + book[i].getAuthor().getLastName() + " " 
						+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
						"\t" + " Название:  " + book[i].getTitle() + "\t" + " Год издания: " + book[i].getYear());
			
			}
		}
		System.out.println("====================================================================");
		
	}

}
