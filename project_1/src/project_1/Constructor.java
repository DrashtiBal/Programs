package project_1;

 class C1 {
	     C1(int a, int b)
	     {
	         System.out.println(" the super class constructor");
	          int z = a + b;
	         System.out.println("the super class method ");
	         System.out.println("the sum is "+z);
	     }
	 }
  class Constructor extends C1
	{
	 Constructor(int x)
	    {
	       super(12, 20);
	        System.out.println("the sub class constructor ");
	        System.out.println(x);
	    }
	    public static void main(String[] args) {
			
	    	Constructor obj = new Constructor(10);
	     }
	}
