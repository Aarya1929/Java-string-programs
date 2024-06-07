package String;
import java.util.*;

public class hash_map {
	public static void main(String args[])
	{
		HashMap <Character,Integer> str_cnt = new HashMap <Character,Integer>();
		String s = "aarya";
		char x;
		int n;
		
		for(int i=0;i<s.length();i++)
		{
			x=s.charAt(i);
			if(str_cnt.containsKey(x))
			{
				n = str_cnt.get(x);
				n++;
				str_cnt.put(x,n);
			}
			else
			{
				str_cnt.put(x,1);
			}
		}
		
		System.out.println(str_cnt);
	}
}
