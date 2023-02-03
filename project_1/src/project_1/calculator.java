package project_1;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n1 ");  
	      int n1= sc.nextInt();
	      System.out.println("Enter operartor ");  
	      String op = sc.next();
	      System.out.println("Enter n2: "); 
	      int n2= sc.nextInt(); 
	      
	      
	      if(op.equals("+"))
	      {
	       System.out.println(n1+n2);
	    }
	      else if (op.equals("-")) {
	    	  
	    	  System.out.println(n1-n2);
		}
	      else if (op.equals("*")) {
	    	  
	    	  System.out.println(n1*n2);
		}
	      else if (op.equals("*")) {
	    	  
	    	  System.out.println(n1/n2);
		}
	      else
	      {
	    	  System.out.println("enter valid operator");
	}
}
}
