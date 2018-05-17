package by.htp.library.entity;

public class Library {
	
	private Book[] books;
	private int lastIndex;
	private int maxLengthOfBooks = 1;
	
	public Library()
	{
		this.books = new Book[maxLengthOfBooks];
	}
	
	public Library(int size)
	{
		this.books = new Book[size];
	}
	
	public Book[] getBooks()
	{
		return this.books;
	}

	public void addBooks(Book book)
	{
		if (lastIndex < maxLengthOfBooks)
		{
			books[lastIndex] = book;
			lastIndex++;
		}
		else if (lastIndex >= maxLengthOfBooks)
		{
			Book[] newBook = new Book[lastIndex + 1];
			for ( int i = 0; i < books.length; i++)
			{
				newBook[i] = books[i];
			}
			newBook[lastIndex] = book;
			books = newBook;
			lastIndex++;
			maxLengthOfBooks++;
		}
	}
}
