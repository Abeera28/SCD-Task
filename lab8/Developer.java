public class Developer extends Employee{
    double bonus;

   public Developer (String name , double basesalary,double bonus)
   {
    super(name, basesalary);
    this.bonus = bonus;
   }

    @Override
     public void Calculate_salary(){
        double totalsalary=  bonus + basesalary;
    
    System.out.println("Employee name is "+ name+"\n"+ "Basic Salary is " +basesalary +"\n"+ "Bonus is "  + bonus + "\n" +"Total Salary is" +  totalsalary);
   }

}
