class Boxes{
	
	int length;
	int breath;
	int height;
	static int count;
	static
	{
		System.out.println("From the Static!");
		count=0;
	}
  Boxes(int l,int b,int h)  //constructor
    {
    	length = l;
    	breath = b;
    	height = h;
    }
    Boxes(Boxes b)
    {
    	length = b.length;   //copy  constructor
    	height = b.height;
    	breath = b.breath;
    }
    void setdim(int l,int b,int h)
    {
    	length = l;
    	breath = b;
    	height = h;
    }
    int Volume()
    {
    	count++;
		return length*breath*height;
	
    }
     void cube(int l)
    {
    	length = height = breath = l;
    	count++;
  
    }
     
     static void Display()
     {
    	 System.out.println("Object Count: "+count);
     }
    
    
}




class staticvariableandmethods {
	public static void main(String args[])
	{
		System.out.println("Main starts here!");
	
	    System.out.println("Before Creating Box Object!");
	
		Boxes blackbox = new Boxes(2,3,4);
	    System.out.println(	" First Object: "+blackbox.Volume());
	    
	    System.out.println("After Creating Box Object!");

	    Boxes  woodBox = new Boxes(3,4,5);
	    System.out.println("Second Object: "+woodBox.Volume());
	    
	    Boxes b3 = new Boxes(3,4,5);
		System.out.println("Third Object: "+b3.Volume());
		
		Boxes b4 = new Boxes(5,8,9);
		System.out.println("Fourth Object: "+b4.Volume());
	
		Boxes.Display();
		
	}

}
