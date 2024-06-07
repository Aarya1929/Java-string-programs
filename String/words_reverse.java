package String;

public class words_reverse {
	
	public static void main(String args[])
	{
		String s="My name is AARYA";
		
		String [] words = s.split("\\s");
		
		int start = 0;
		int end = words.length-1;
		String x,y,temp;
		
		while(start<end)
		{
			x=words[start];
			y=words[end];
			
			words[start]=y;
			words[end]=x;

			start++;
			end--;
		}
		String rev = String.join(" ", words);
		System.out.println(rev);
	}
}
