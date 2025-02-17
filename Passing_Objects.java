public class Passing_Objects {
	int length;
	int breath;
	int height;
	
	Passing_Objects(int length,int breath,int heigth)
	{
		this.length = length;
		this.breath = breath;
		this.height = heigth;
	}
	int Volume()
	{
		return length*breath*height;
	}
	boolean isEqual(Passing_Objects p)
	{
		if(length == p.length && breath == p.breath && height == p.height)
			return true;
		
	return false;
	}
	
	

	public static void main(String[] args) {
		Passing_Objects p1= new Passing_Objects(5,6,7);
		System.out.println("Volume: "+p1.Volume());
		Passing_Objects p2 = new Passing_Objects(5,6,7);
		System.out.println("p1 is equal to p2 = ? (true/false): " +p1.isEqual(p2) );
		
		

	}

}
