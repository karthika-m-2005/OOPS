class Box   
{
	int length;
	int breath;
	int height;
	
	Box(int l,int b,int h)   //constructor
	{
		length = l;
		breath = b;
		height = h;
	}
	
	Box DoubleBox()
	{
		Box temp = new Box(2*length,2*breath,2*height);
		return temp;
	}
}
public class Return_Object {
   	public static void main(String[] args) {
		
	    Box b1 = new Box(5,8,9);
	    Box b2 = b1.DoubleBox();
	    System.out.println(b2.length);
      System.out.println(b2.breath);
      System.out.println(b2.height);
      

	}

}
