package String;

public class palindromeinteger {
	public static boolean ispalindrome(int n)
	{
		int temp,r,sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum!=temp)
		{
			return false;
		}
		return true;
	}
	
	public static void main(String [] args)
	{
		int n = 021;
		if(ispalindrome(n))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
