package String;

import java.util.HashMap;

public class string_encryption {
	
	public static StringBuilder encrypt(HashMap <Character, Integer> hp)
	{
		int n;
		String hex;
		StringBuilder res = new StringBuilder();
		
		for(Character key:hp.keySet())
		{
			n=hp.get(key);
			hex = Integer.toHexString(n);
			res.append(key);
			res.append(hex);
		}
		
		res=res.reverse();
		return res;
	}

	public static void main(String[] args)
	{
		HashMap <Character, Integer> str_cnt = new HashMap<>();
		String s = "aaaaaaaaaaa";
		char x;
		int n;
		
		for(int i=0;i<s.length();i++)
		{
			x=s.charAt(i);
			if(str_cnt.containsKey(x))
			{
				n = str_cnt.get(x);
				n++;
				str_cnt.put(x, n);
			}
			else
			{
				str_cnt.put(x, 1);
			}
		}
		StringBuilder res = encrypt(str_cnt);
		System.out.println(res);
	}
}
