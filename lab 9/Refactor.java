import java.util.*;

class Book {
    public String title;
    public double price;
    public int quantity;
    
    public Book(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
    
    // MOVED METHOD: Moved from Customer class as it only uses Book data
    public double applyDiscount(double percentage) {
        return price - (price * percentage / 100);
    }
    
    // The isSoldOut() method has been REMOVED (INLINED)
}

class Customer {
    public String name;
    
    // The applyDiscount method has been MOVED to Book class
}

public class Refactor {
    // ENCAPSULATED COLLECTION: Made private with controlled access
    private List<Book> inventory = new ArrayList<>();
    
    // Method to add books
    public void addBook(Book book) {
        inventory.add(book);
    }
    
    // Method to get inventory
    public List<Book> getInventory() {
        return inventory;
    }
    
    public void displayInventory() {
        for (Book b : inventory) {
            // INLINED: Direct check instead of calling isSoldOut()
            if (b.quantity <= 0) {
                System.out.println(b.title + " is out of stock.");
            } else {
                System.out.println(b.title + " - $" + b.price);
            }
        }
    }
}