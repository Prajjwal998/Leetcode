// Problem: Given an integer array nums, find the subarray with the largest 
// sum, and return its sum.
// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.


import java.util.*;
class Maximum_Subarray_53
{
	public static void maxSumSubArray(int [] ar)
	{
		int sum=ar[0];
		int maxsum=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(sum>=0)
				sum+=ar[i];
			else 
				sum=ar[i];
			
			if(maxsum<sum)
				maxsum=sum;
		}
		System.out.println(maxsum);
	}
	public static void main(String args[])
	{
		int ar[]=inputArray();
		System.out.println(Arrays.toString(ar));
		maxSumSubArray(ar);
		
	}
	public static int[] inputArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
		{
			int element=sc.nextInt();
			ar[i]=element;
		}
		return ar;
	}
	
}
