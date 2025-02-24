class Employee  //base class or super class or parent class
{
	private String name;
	private double salary;
	private String date;
	Employee(String n,double s,String i)
	{
		name = n;
		salary = s;
		date  =  i;
		
	}
	
	/*Employee()
	{
		name = " ";
		salary = 00.00;
	}*/
     public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public double getSalary() { return salary;}
	public void setSalary(double s) {salary = s;}
	public String getDate()
	{
		return date;
	}
	public void setDate(String d)
	{
		date = d;
	}
	
	public void RaisePercentage(double percentage)
	{
	    salary += salary*percentage/100;
	}
	
	public void DisplayInfo() //Overriding
	{
		System.out.println("-------------Employee---------------");
		System.out.println("Name of the Employee: " + getName());
		System.out.println("Salary of the Employee: "+getSalary());
		System.out.println("Joining Date: " + getDate());
	}
}
class Manager extends Employee   //derived class or sub class or child class
{
	double bonus;
	Manager(String n,double s,String d,double b)
	{
		super(n,s,d);
		bonus = b;
	}
	
	public double getSalary()  //overriding
	{
		return super.getSalary()+bonus;
	}
	public void setBonus(double b)
	{
		bonus = b;
	}
	public void DisplayInfo()
	{
		System.out.println("--------------Manager---------------");
		System.out.println("Name of the Employee: " + getName());
		System.out.println("Salary of the Employee: "+getSalary());
		System.out.println("Joining Date: " + getDate());
		System.out.println("Bonus: "+super.getSalary());
		System.out.println("------------------------------------");
	}
	
	
}

public class Inheritance {
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Karthika",55000,"1-5-2025");
		e1.RaisePercentage(10);
		e1.DisplayInfo();
		
		
		
		Manager m1 = new Manager("janani",50000,"1-4-2028", 10000);
		m1.DisplayInfo();
		
				
	}

	
}
