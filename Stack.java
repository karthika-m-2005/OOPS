package oops;

public class Stack {
	int[] s = new int[10];
	int tos;
	
	Stack(){   //constractor
		tos = -1;
	}
	
	void push(int item)   //push operation
	{
		if(tos == 9)
		{
			System.out.println("Stack is Full");
		}
		else
		{
		    s[++tos] =  item;
		}
		
	}
	int pull()    //pull operation
	{
		if(tos>=0)
		{
			return s[tos--];
		}
		else
		{
			System.out.print("Stack is Empty");
			return -1;
		}
		
	}
}
