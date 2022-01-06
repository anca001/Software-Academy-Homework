package homeLearningTask5;

public class Book {

	String title;
	String author;
	String Number_of_pages;
	String publisher;
	
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
	
	public String getNumber() {
		return Number_of_pages;
	}
	
	public void setNumber(String Number_of_pages) {
		this.Number_of_pages = Number_of_pages;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.setTitle("The Great Gatsby");
		b2.setTitle("1984");
		b3.setTitle("The Fellowship of the ring");
		
		b1.setAuthor(" F Fitzgerald");
		b2.setAuthor(" George Orwell");
		b3.setAuthor(" J.R.R Tolkien");
		
		b1.setNumber(" 218 pages");
		b2.setNumber(" 328 pages");
		b3.setNumber(" 423 pages");
		
		b1.setPublisher(" Charles Scribner's Sons");
		b2.setPublisher(" Secker & Warburg");
		b3.setPublisher(" George Allen & Unwin");

		
		System.out.println("Book title: " + b1.getTitle());
		System.out.println("Author: " + b1.getAuthor());
		System.out.println("Number of pages: " + b1.getNumber());
		System.out.println("Publisher: " + b1.getPublisher());

		System.out.println("=============================");
		
		System.out.println("Book title: " + b2.getTitle());
		System.out.println("Author: " + b2.getAuthor());
		System.out.println("Number of pages: " + b2.getNumber());
		System.out.println("Publisher: " + b2.getPublisher());

		System.out.println("=============================");
		
		System.out.println("Book title: " + b3.getTitle());
		System.out.println("Author: " + b3.getAuthor());
		System.out.println("Number of pages: " + b3.getNumber());
		System.out.println("Publisher: " + b3.getPublisher());

		
		
	
		
	}
	
}

