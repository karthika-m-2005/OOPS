public class PassingObject_2 {
	int length;
	int breath;
	int height;
	
	PassingObject_2(int l,int b,int h)
	{
		length = l;
		breath = b;
		height = h;
		
	}
	PassingObject_2(PassingObject_2 b) //copy constructor
	{
		length = b.length;
		breath = b.breath;
		height = b.height;
	}

	public static void main(String[] args) {
		
		PassingObject_2 b1 = new PassingObject_2(5,6,9); 
		
		System.out.println("Length of Object_1: "+b1.length);
		
		PassingObject_2 b2 = new PassingObject_2(b1);
		
		System.out.println("Height of Object_2: "+b2.height);
		
		

	}

}
