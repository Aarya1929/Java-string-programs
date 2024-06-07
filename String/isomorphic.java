package String;

public class isomorphic {
	
	public static boolean is_isomorphic(String s1, String s2) {
		char x,y;
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		for(int i=0;i<s1.length();i++)
		{
			x=s1.charAt(i);
			y=s2.charAt(i);
			if(x!=y)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		String s1="aabd";
		String s2="aabf";
		
		if(is_isomorphic(s1,s2))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
