public class Media {
    public String title;
    public String publisher;
    public int year;
    
    
    public Media(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
    }
}