package project_1;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int number=0,original=number,reverse=0,rem=0;
		
		while(number!=0)
		{
		rem=number%10;
		reverse=reverse*10+rem;
		number=number/10;
		}
		if(original==reverse)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
	}

}
