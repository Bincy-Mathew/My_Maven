package encapsulation;

public class EncapsulatedEmployee
{
    private String EmpName;
    private float Salary;
    private float bonus = 500.0f;
 public void setter(String EmpName, float Salary)
  {
	  this.EmpName = EmpName;
	  this.Salary = Salary;
  }
 public void getter() 
  {
	  Salary= Salary + bonus;
	  System.out.println("Employee Name is :" +EmpName  );
	  System.out.println("Salary is :"  +Salary );
}
  }
