package String;

public class panagram {
	
	public static boolean isPanagram (String s)
	{
		char x;
		for(int i=0;i<s.length();i++)
		{
			x = s.charAt(i);
			if(!((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String s = "aabbccdd";
		if(isPanagram(s))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
