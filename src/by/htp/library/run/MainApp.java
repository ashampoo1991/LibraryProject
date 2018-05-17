package by.htp.library.run;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.Library;
import by.htp.library.logic.LibrarianAuthor;
import by.htp.library.logic.LibrarianATYv1;
import by.htp.library.logic.LibrarianATYv2;
import by.htp.library.logic.LibraryList;
import by.htp.library.logic.LibrarianByName;
import by.htp.library.logic.LibrarianByTitle;

public class MainApp {

	public static void main(String[] args) {
		
		Author a1 = new Author("Достоевский", "Федор", "Михайлович", 1821);
		Author a2 = new Author("Булгаков", "Михаил", "Афанасьевич", 1891);
		Author a3 = new Author("Гоголь", "Николай", "Васильевич", 1809);
		Author a4 = new Author("Пушкин", "Александр", "Сергеевич", 1799);
		Author a5 = new Author("Толстой", "Лев", "Николаевич", 1828);
		
		Book b1 = new Book(a3, "Мертвые души", 1842);
		Book b2 = new Book(a2, "Мастер и Маргарита", 1940);
		Book b3 = new Book(a1, "Идиот", 1869);
		Book b4 = new Book(a5, "Война и мир", 1869);
		Book b5 = new Book(a4, "Евгений Онегин", 1832);
		Book b6 = new Book(a3, "Ночь перед Рождеством", 1842);
		
		Library library = new Library();
		library.addBooks(b1);
		library.addBooks(b2);
		library.addBooks(b3);
		library.addBooks(b4);
		library.addBooks(b5);
		library.addBooks(b6);
		
		System.out.println("Список литературы:");
		LibraryList informer = new LibraryList();		
		informer.printLibrary(library);
		
		System.out.println("Список произведений Гоголя:");		
		LibrarianAuthor librarian = new LibrarianAuthor();
		librarian.printLibrarian(library);
		
		System.out.println("Пушкин, <<Евгений Онегин>>, 1832");
		LibrarianATYv1 aty = new LibrarianATYv1();
		aty.printLibrarian(library);
		
		System.out.println("Поиск по автору: ");
		LibrarianByName byName = new LibrarianByName();
		byName.printLibrarian(library);
		
		System.out.println("Поиск по автору/названию/году издания: ");
		LibrarianATYv2 byATY = new LibrarianATYv2();
		byATY.printLibrarian(library);
		
		System.out.println("Поиск по названию произведения: ");
		LibrarianByTitle byTitle = new LibrarianByTitle();
		byTitle.printLibrarian(library);
		
	
		
		
		
		
		

	}

}
