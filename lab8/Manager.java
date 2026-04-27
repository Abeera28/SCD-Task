public class Manager extends Employee {
    double incentive;

   public Manager(String name , double basesalary, double incentive)
   {
    super(name, basesalary);
    this.incentive = incentive;
   }

    @Override
     public void Calculate_salary(){
        double totalsalary=  basesalary + incentive;
    
    System.out.println("Employee name is "+ name+"\n"+ "Basic Salary is " +basesalary +"\n"+ "Incentive is "  + incentive + "\n" +"Total Salary is " +  totalsalary);
   }
}
