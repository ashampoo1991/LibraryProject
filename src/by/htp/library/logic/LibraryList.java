package by.htp.library.logic;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibraryList {
	
	public void printLibrary(Library library)
	{
		
		int librarySize = library.getBooks().length;
		
		Book[] book = library.getBooks();
		
		for ( int i = 0 ; i <librarySize; i ++)
		{
			System.out.println("�����: " + book[i].getAuthor().getLastName() + " " 
		+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
		"\t" + " ��������:  " + book[i].getTitle() + "\t" + " ��� �������: " + book[i].getYear());
		}
		System.out.println("====================================================================");
	}

}
