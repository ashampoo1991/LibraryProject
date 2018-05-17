package by.htp.library.entity;

public class Author {

	// У Автора есть имя, фамилия, отчество, год рождения.

	private String firstName;
	private String lastName;
	private String pat;
	private int bYear;

	public Author() {

	}

	public Author(String lastName, String firstName, String pat, int bYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pat = pat;
		this.bYear = bYear;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPat() {
		return this.pat;
	}

	public void setPat(String pat) {
		this.pat = pat;
	}

	public int getBYear() {
		return this.bYear;
	}

	public void setBYear(int bYear) {
		this.bYear = bYear;
	}
}
