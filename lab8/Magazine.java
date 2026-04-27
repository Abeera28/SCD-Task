public class Magazine extends Media {
   public int issueNumber;
    public String frequency;

    public Magazine(String title, String publisher, int year, String frequency, int issueNumber)
    {
        super(title,publisher,year);
        this.issueNumber=issueNumber;
        this.frequency=frequency;

    }
     @Override
    public void displayDetails() {
        System.out.println("\n=== MAGAZINE DETAILS ===");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Frequency: " + frequency);
        System.out.println("=======================");
    }
}
