abstract class Member
{
	private String name;
	abstract void welcomeMessage();
}
class student extends Member
{
	void welcomeMessage()
	{
		System.out.println("Hello Student....");
	}
	
}

class teacher extends Member
{
	void welcomeMessage()
	{
		System.out.println("Hello Teacher....");
	}
}

public   class Abstract 
{
	

	public  static void main(String[] args) 
	{
		
	 
	   student s1 = new student();
	   teacher t1 = new teacher();
	   s1.welcomeMessage();
	   t1.welcomeMessage();
	   
	
	   Member[] m1 = new Member[4];
	   m1[0] = new teacher();
	   m1[1] = new student();
	   m1[2] = new teacher();
	   m1[3] = new student();
	   
	   
	   
	   for(Member mm : m1)
	   {
		   mm.welcomeMessage();
	   }
	   
		

	}

}
