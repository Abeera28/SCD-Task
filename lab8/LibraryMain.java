public class LibraryMain {
    public static void main(String[] args) {
        Media[] med=new Media[3];
        med[0]=new Book("Software Construction Development","LB Books",2024,"Abeera Nadeem",200,"00-012315040");
        med[1]=new Magazine("National Geographics","Geographic Sociecty",2025,"Monthly",112);
        med[2]=new Book("Software Risk Management","LB Books",2026,"Nadeem Iqbal",115,"112-3234556");


        for (Media m1:med )
        {
            m1.displayDetails();

        }
    }
}
