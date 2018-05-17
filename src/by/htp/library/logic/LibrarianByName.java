package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.entity.Book;
import by.htp.library.entity.Library;

public class LibrarianByName {
	
	static Scanner scan = new Scanner(System.in);
		
	public void printLibrarian( Library library){
	
	Book[] book2 = library.getBooks();

	

	System.out.print("Введите фамилию автора: ");
	String x = scan.nextLine();
			
			for ( int i = 0; i < book2.length; i++)
			{
			if ( x.equals(book2[i].getAuthor().getLastName())) //вместо "Гоголь" написать x, где x = nextString
			{
				System.out.println("Автор: " + book2[i].getAuthor().getLastName() + " " 
						+ book2[i].getAuthor().getFirstName() + " " + book2[i].getAuthor().getPat() + 
						"\t" + " Название:  " + book2[i].getTitle() + "\t" + " Год издания: " + book2[i].getYear());
						}
			
			}
			
			System.out.println("====================================================================");

}
}
