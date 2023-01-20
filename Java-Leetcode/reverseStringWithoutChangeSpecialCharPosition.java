import java.util.*;
class reverseStringWithoutChangeSpecialCharPosition
{
	public static void reverseStringWithoutChangeSpecialCharPosition(String s)
	{
		char sChar[]=s.toCharArray();
		System.out.println(Arrays.toString(sChar));
		int left=0;
		int right=sChar.length-1;
		
		while(left<right)
		{
			if((sChar[left]<'a' || sChar[left]>'z')&&(sChar[left]<'A' || sChar[left]>'Z'))
			{
				left++;
				continue;
			}
			if((sChar[right]<'a' || sChar[right]>'z')&&(sChar[right]<'A' || sChar[right]>'Z'))
			{
				right--;
				continue;
			}
			
			char t=sChar[left];
			sChar[left]=sChar[right];
			sChar[right]=t;
			
			left++;
			right--;
		}
		
		String sprint=new String(sChar);
		System.out.println(sprint);
	}
	
	public static void main(String args[])
	{
		String s=inputString();
		System.out.println("input String= "+ s);
		reverseStringWithoutChangeSpecialCharPosition(s);	
	}
	
	public static String inputString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.next();
		return s;
	}
	
}