package factorial;

import java.util.Scanner;

public class Factorial {
	
static int fact(int n)
{
	if(n==0 || n==1)
	{
		return 1;
		
		
	}
	else {
		return(n*fact(n-1));
		//System.out.println("facrorial is"+result);
	}
}


public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter number::");
	int n=s.nextInt();
	int result=1;
	result=fact(n);
	System.out.println("factorial of" +n+ "is:" +result);
}
}
