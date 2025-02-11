package oops;

public class StackChar {

	char[] ss = new char[9];
	int tos;
	
	StackChar()
	{
		tos = -1;
	}
	
	void push(char item)
	{
		if(tos ==9)
		{
			System.out.println("Stack is Full!");
		}
		else
		{
			ss[++tos] = item;
		}
		
	}
	
	char pull()
	{
		if(tos>=0)
		{
			return ss[tos--];
		}
		else
		{
			System.out.print("Stack is Empty!");
			return '0';
			
		}
	}
}
