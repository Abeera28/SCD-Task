public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[2];
         staff[0]=new Developer("Abeera", 5000, 2500);
         staff[1]=new Manager("Nadeem ", 10000, 20000);

         for (Employee emp : staff)
         {
            emp.Calculate_salary();
         }


        // Employee e1= new Employee("Abeera",5000);
        // e1.Calculate_salary();

        // System.out.println("Developer Info");
        // Developer d1 = new Developer("Abeera",5000,2500);
        // d1.Calculate_salary();

        //  System.out.println("Manager Info");
        // Manager m1 = new Manager("Nadeem" ,10000, 20000);
        // m1.Calculate_salary();

    }
}
