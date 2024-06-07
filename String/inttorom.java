package String;

public class inttorom {
	
	public static String int_to_roman(int x) {
		StringBuilder sb = new StringBuilder();
		
		
		while(x>0)
		{
			if(x>=1000)
			{
				sb.append("M");
				x-=1000;
			}
			else if (x>=900)
			{
				sb.append("CM");
				x-=900;
			}
			else if (x>=500)
			{
				sb.append("D");
				x-=500;
			}
			else if (x>=400)
			{
				sb.append("CD");
				x-=400;
			}
			else if (x>=100)
			{
				sb.append("C");
				x-=100;
			}
			else if (x>=90)
			{
				sb.append("XC");
				x-=90;
			}
			else if (x>=50)
			{
				sb.append("L");
				x-=50;
			}
			else if (x>=40)
			{
				sb.append("XL");
				x-=40;
			}
			else if (x>=10)
			{
				sb.append("X");
				x-=10;
			}
			else if (x>=9)
			{
				sb.append("IX");
				x-=9;
			}
			else if (x>=5)
			{
				sb.append("V");
				x-=5;
			}
			else if (x>=4)
			{
				sb.append("IV");
				x-=4;
			}
			else if (x>=1)
			{
				sb.append("I");
				x-=1;
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		int num=576;
		String res = int_to_roman(num);
		System.out.println(res);
	}
}
