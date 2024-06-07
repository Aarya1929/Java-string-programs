package String;

public class fibonacci {
	public static void main(String[] args)
	{
		int tot=10,n=3;
		int s1=0,s2=1,s3;
		System.out.printf("%d, %d ", s1,s2);
		while(n<=tot)
		{
			s3=s1+s2;
			s1=s2;
			s2=s3;
			n=n+1;
			System.out.printf(",%d ",s3);
		}
	}
}
