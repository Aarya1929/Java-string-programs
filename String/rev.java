package String;

public class rev {
	
	public static void main(String args[])
	{
		String s = "abcde";
		
		int start=0;
		int end=s.length()-1;
		char[] arr = s.toCharArray();
		
		while(start<end)
		{
			char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
			start++;
			end--;
		}
		
		String rev= new String(arr);
        System.out.println(rev);
	}
}

