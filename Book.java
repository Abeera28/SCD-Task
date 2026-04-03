public class Book {

    // Private Fields
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor A: Title and Author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;  // default availability
    }

    // Constructor B: Title only
    public Book(String title) {
        this.title = title;
        this.author = "Nadeem Iqbal";
        this.isAvailable = true;  // default availability
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Borrow method (No setter for isAvailable)
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Error: Book is already borrowed.");
        }
    }

    // Return method
    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
}