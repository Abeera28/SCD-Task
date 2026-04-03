public class BookMain {

    public static void main(String[] args) {

        // Create two books using both constructors
        Book book1 = new Book("Java Programming", "Abeera Nadeem");
        Book book2 = new Book("Data Structures");

        // Borrow first book twice
        System.out.println("First Borrow Attempt:");
        book1.borrowBook();
        
        System.out.println("Second Borrow Attempt:");
        book1.borrowBook();  // Should show error

        // Return the book
        System.out.println("Returning Book:");
        book1.returnBook();

        // Borrow again
        System.out.println("Borrowing Again:");
        book1.borrowBook();

        // Print status of both books
        System.out.println("\n--- Book Status ---");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Available: " + book1.getIsAvailable());

        System.out.println("\nTitle: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Available: " + book2.getIsAvailable());
    }
}