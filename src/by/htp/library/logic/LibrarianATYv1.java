package by.htp.library.logic;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianATYv1 {
	
	public void printLibrarian(Library library)
	{
		Book[] book = library.getBooks();
		
		for ( int i = 0 ; i < book.length; i++)
		{
			if ( book[i].getAuthor().getLastName() == "������" && book[i].getTitle() == "������� ������" && book[i].getYear() == 1832)
			{
				System.out.println("�����: " + book[i].getAuthor().getLastName() + " " 
						+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
						"\t" + " ��������:  " + book[i].getTitle() + "\t" + " ��� �������: " + book[i].getYear());
			}
		}
		System.out.println("====================================================================");
		
		
	}

}
