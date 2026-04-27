public class Book extends Media {
    public String author;
    public int pages;
    public String isbn;
    
    public Book(String title, String publisher, int year, 
                String author, int pages, String isbn) {
        super(title, publisher, year); 
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }
   
    @Override
    public void displayDetails() {
        System.out.println("\n=== BOOK DETAILS ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Pages: " + pages);
        System.out.println("ISBN: " + isbn);
        System.out.println("===================");
    }
}