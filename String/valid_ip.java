package String;

import java.util.*;

public class valid_ip {
	public static boolean is_valid(String s)
	{
		String [] integers= s.split("\\.");
		if(integers.length!=4)
		{
			return false;
		}
		int x;
		for(int i=0;i<4;i++)
		{
			x= Integer.parseInt(integers[i]);
			if(x<0 || x>255)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		String s = "257.182.35.4";
		if(is_valid(s))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
