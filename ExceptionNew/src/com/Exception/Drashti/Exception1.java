package com.Exception.Drashti;

public class Exception1 {

	   public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/5; //may throw exception   
	  
	        }  
	             
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
}
