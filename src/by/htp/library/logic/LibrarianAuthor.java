package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianAuthor {
	
	public void printLibrarian(Library library)
	{
		
		
		
		
		Book[] book = library.getBooks();
		
		for ( int i = 0; i < book.length; i++)
		{
		if ( book[i].getAuthor().getLastName() == "������") //������ "������" �������� x, ��� x = nextString
		{
			System.out.println("�����: " + book[i].getAuthor().getLastName() + " " 
					+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
					"\t" + " ��������:  " + book[i].getTitle() + "\t" + " ��� �������: " + book[i].getYear());
					}
		}
		
		System.out.println("====================================================================");
		
		
		

	}

}
