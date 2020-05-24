
public class Employee
{
   String EmployeeName;
    double sal,FinalSalary; 
  void init( String name,double salary)
  {
      EmployeeName= name;
      sal= salary;
    }
    double CalcSalary()
    {
      FinalSalary= (50.0/100 * sal) + sal;
      return FinalSalary;
    }
    void displayName  ()
    {
        System.out.println (EmployeeName);
    }
public static void main( )
{
 Employee obj= new Employee();
 obj. init("Anusha", 1000.0 );
 double result=obj.CalcSalary();
 System.out.println("The Salary is " + result);
 obj.displayName();
}
}