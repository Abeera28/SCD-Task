public class Employee {
   String name;
   double basesalary;

   public Employee(String name , double basesalary ){
    this.name=name;
    this.basesalary=basesalary;
   }

   public void Calculate_salary(){
    System.out.println(name+ "'s Salary is "  +basesalary);
   }
}
