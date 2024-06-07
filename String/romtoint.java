package String;

public class romtoint {
	
	public static int eval(char x)
	{
		switch(x) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	
	public static int roman_to_int(String s)
	{
		int no = 0;
		char x;
		
		for(int i=0;i<s.length();i++)
		{
			x=s.charAt(i);
			no=no+eval(x);
		}
		return no;
	}
	
	public static void main(String args[])
	{
		String s = "LXI";
		int res = roman_to_int(s);
		System.out.println(res);
	}
}
