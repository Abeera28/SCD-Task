public class Trycatch {
    public static void main(String[] args) {
        
        try {
            int balance = 100;
            int withdraw = 200;
            
            if (withdraw > balance) {
                throw new Exception("Not enough money!");
            }
            
            System.out.println("Here's your $" + withdraw);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}