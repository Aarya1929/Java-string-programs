package String;
import java.util.*;

public class low_occur {
	
	public static void low_occur(HashMap<Character, Integer> hp, String s){
		int minOccur=Integer.MAX_VALUE;
		
		for(int count:hp.values())
		{
			minOccur=Math.min(minOccur, count);
		}
		
		StringBuilder res = new StringBuilder();
		for(char ch:s.toCharArray())
		{
			if(hp.get(ch)!=minOccur)
			{
				res.append(ch);
			}
		}
		res.toString();
		
		System.out.println("Final String:"+res);
	}
	
	public static void main(String args[])
	{
		HashMap <Character,Integer> hp = new HashMap <>();
		String s = "aarya";
		char x;
		int n;
		
		for(int i=0;i<s.length();i++)
		{
			x=s.charAt(i);
			if(hp.containsKey(x))
			{
				n = hp.get(x);
				n++;
				hp.put(x, n);
			}
			else
			{
				hp.put(x, 1);
			}
		}
		System.out.println("Initial String:"+s);
		
		low_occur(hp,s);
	}
}
