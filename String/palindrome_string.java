package String;

public class palindrome_string {
	public static boolean ispalindrome(String s)
	{
		int start=0;
		int end=s.length()-1;
		char x,y;
		while(start<end)
		{
			x=s.charAt(start);
			y=s.charAt(end);
			if(x!=y)
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		String s ="aaba";
		if(ispalindrome(s))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
