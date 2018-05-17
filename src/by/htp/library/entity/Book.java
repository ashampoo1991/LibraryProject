package by.htp.library.entity;

public class Book {

	// У Книги есть след. свойства: год издания, название, Автор.

	private int year;
	private String title;
	private Author author;

	public Book() {

	}

	public Book(Author author, String title, int year) {
		this.author = author;
		this.title = title;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
