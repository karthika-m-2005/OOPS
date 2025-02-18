

class Box
{
	int length;
	int breath;
	int height;
	
	Box(int l,int b,int h)
	{
		length = l;
		breath = b;
		height = h;
	}
	boolean  increament(Box b)
	{
		b.length++;
		if(length == b.length && height == b.height && breath == b.breath)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
public class CallBy {
	
	static void increaments(int a)
	{
		 a++;
	}
	
	 

	public static void main(String[] args) {
		int a = 10;
	    increaments(a);         //call by value
	    System.out.println(a);
	    Box b1 = new Box(5,8,9);
	    Box b2 = new Box(5,8,9);
	    System.out.println(b1.increament(b2));  // // call by reference
	    System.out.println(b2.length); 

	}

}
