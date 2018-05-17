package by.htp.library.logic;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianATYv1 {
	
	public void printLibrarian(Library library)
	{
		Book[] book = library.getBooks();
		
		for ( int i = 0 ; i < book.length; i++)
		{
			if ( book[i].getAuthor().getLastName() == "Пушкин" && book[i].getTitle() == "Евгений Онегин" && book[i].getYear() == 1832)
			{
				System.out.println("Автор: " + book[i].getAuthor().getLastName() + " " 
						+ book[i].getAuthor().getFirstName() + " " + book[i].getAuthor().getPat() + 
						"\t" + " Название:  " + book[i].getTitle() + "\t" + " Год издания: " + book[i].getYear());
			}
		}
		System.out.println("====================================================================");
		
		
	}

}
