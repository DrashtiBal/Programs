package com.Array.Drashti;

public class Sum {

	public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
        {
                if(nums[i]+nums[j]==target)
                	System.out.print(nums[i] +" "+ nums[j]); 
        } 
             
        }
        
    }
	public static void main()
	{	
			Sum s1=new Sum();
			s1.twoSum( 9);
	}
}
