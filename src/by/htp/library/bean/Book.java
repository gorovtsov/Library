package by.htp.library.bean;

public class Book {
	private int id;
	private String title;
	private String author;
	private int printYear;
	
	public Book() {}
	
	public Book(int id, String title, String author, int printYear) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.printYear = printYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrintYear() {
		return printYear;
	}
	public void setPrintYear(int printYear) {
		this.printYear = printYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + printYear;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (printYear != other.printYear)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		//return "Book [id:" + id + "| title=" + title + "| author:" + author + "| printYear:" + printYear + "]";
		return id + ";" + title + ";" + author + ";" + printYear;
	}
	
	
}
