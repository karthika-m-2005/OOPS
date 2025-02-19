import java.util.Scanner;
public class fibo {
	static int  fibo_s(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else if(n==1)
			return 1;
		else
			return fibo_s(n-1)+fibo_s(n-2);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
          System.out.println("enter the value:");
		
		int n = sc.nextInt();
		System.out.println("Fibonacci Series: ");
		for(int i=0;i<=n;i++) {
		System.out.print(fibo_s(i)+" ");
		}
		

	}

}
