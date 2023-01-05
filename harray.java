import java.util.*;
class harray
{
	public static void main(String ags[])
	{
		int arr[]={1,2,3,4,5};
		int n=12;
		int op[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]+arr[i+1]+arr[i+2])==n)
			{
				op[0]=arr[i];
				op[1]=arr[i+1];
				op[2]=arr[i+2];
				
				break;
				
			}
		}
		
		for(int i=0;i<op.length;i++)
		System.out.print(op[i]+",");
			
		// System.out.println(Arrays.toString(op));
	}
}