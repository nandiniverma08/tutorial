package javatutorial;

import java.util.ArrayList;

// Exercise sol 7 
/*	
//create a library manaegement system which is capable of issuing books to the students.
	1. book name
   2. book author
   3. issued to
   4. issued on
   user should be able to add books , return issued books , issue books
	assume that all the users are registered 	with their names in the central database   
	*/


class Book{
	public String name, author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	 @Override
	 public String toString() {
		 return "Book { " + "name = " + name + "\'" + ", author " +
	        author + "\'" + "}" ;
	 }
}



class MyLibrary{
	public ArrayList<Book> books;
	public MyLibrary(ArrayList<Book> books) {
		
		this.books = books;
		
	}
	
	public void addBook(Book book) {
		System.out.println("The book has been added to the library");
		this.books.add(book);
	}
	
	public void issueBook(Book book, String issued_to) {
		System.out.println("The book has been issued from the library to " + issued_to );
		this.books.remove(book);
	}
	
	public void returnBook(Book b) {
		System.out.println("The book has been returned");
		this.books.add(b);
	}
	
}
	

public class cwh_113_ex7sol {
	
	public static void main(String[] args) {
		
	ArrayList<Book> bk = new ArrayList<>();
	
	Book b1 = new Book("Physics", "HC Verma");
	bk.add(b1);
	
	Book b2 = new Book("Chemistry", "RD Madan");
	bk.add(b2);
	
	
	Book b3 = new Book("Maths", "RD Sharma");
	bk.add(b3);
	
	Book b4 = new Book("English", "Shakespeare");
	bk.add(b4);
	
	
		
		
	MyLibrary l = new MyLibrary(bk);
	l.addBook(new Book("Biology" , "Sarita Agarwal"));
	System.out.println(l.books);
	l.issueBook(b3, "Nandini");
	System.out.println(l.books);	
	
	l.returnBook(b3);
	System.out.println(l.books);
	
	}

}
