

class Student
{
	String name;
	int roll_no;
	int[] marks;
	
	Student()
	{
		this.name = "Unknown";
		this.roll_no = 00;
		this.marks =  new int[] {0,0,0,0,0};
	}
	
	
	Student(String name,int roll_no,int[] marks)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
		
	}
	
	
	Student(String n,int r)
	{
		name = n;
		roll_no = r;
		this.marks = new int[] {0,0,0};
	}
	
	
	
	int marktotal()
	{
		int total = 0;
		for(int i = 0;i<marks.length;i++)
		{
	       total += marks[i];
		}
		return total;
	}
	
	void Display()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Name of the Student: "+name);
		System.out.println("Roll Number of the Student: "+roll_no);
		System.out.print("Marks: ");
		
		for(int arr : marks)
		{
			System.out.print(arr+" ");
		}
		System.out.println("\nTotal_Marks: "+ marktotal());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

public class ProjectStudent {
	
	public static void main(String[] args) {
		
		Student ob = new Student();
		ob.Display();
		
		Student od1 = new Student("Alice",12348);
		od1.Display();
		
		int[] m = {57,52,52,57,59};
		Student ob2 = new Student("Bob",1234,m);
		ob2.Display();
		
		
		
		
	}

}
