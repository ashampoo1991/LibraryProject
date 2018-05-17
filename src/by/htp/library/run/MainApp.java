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
		
		Author a1 = new Author("�����������", "�����", "����������", 1821);
		Author a2 = new Author("��������", "������", "�����������", 1891);
		Author a3 = new Author("������", "�������", "����������", 1809);
		Author a4 = new Author("������", "���������", "���������", 1799);
		Author a5 = new Author("�������", "���", "����������", 1828);
		
		Book b1 = new Book(a3, "������� ����", 1842);
		Book b2 = new Book(a2, "������ � ���������", 1940);
		Book b3 = new Book(a1, "�����", 1869);
		Book b4 = new Book(a5, "����� � ���", 1869);
		Book b5 = new Book(a4, "������� ������", 1832);
		Book b6 = new Book(a3, "���� ����� ����������", 1842);
		
		Library library = new Library();
		library.addBooks(b1);
		library.addBooks(b2);
		library.addBooks(b3);
		library.addBooks(b4);
		library.addBooks(b5);
		library.addBooks(b6);
		
		System.out.println("������ ����������:");
		LibraryList informer = new LibraryList();		
		informer.printLibrary(library);
		
		System.out.println("������ ������������ ������:");		
		LibrarianAuthor librarian = new LibrarianAuthor();
		librarian.printLibrarian(library);
		
		System.out.println("������, <<������� ������>>, 1832");
		LibrarianATYv1 aty = new LibrarianATYv1();
		aty.printLibrarian(library);
		
		System.out.println("����� �� ������: ");
		LibrarianByName byName = new LibrarianByName();
		byName.printLibrarian(library);
		
		System.out.println("����� �� ������/��������/���� �������: ");
		LibrarianATYv2 byATY = new LibrarianATYv2();
		byATY.printLibrarian(library);
		
		System.out.println("����� �� �������� ������������: ");
		LibrarianByTitle byTitle = new LibrarianByTitle();
		byTitle.printLibrarian(library);
		
	
		
		
		
		
		

	}

}
