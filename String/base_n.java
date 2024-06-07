package String;

import java.util.Scanner;

public class base_n {

	public static void main(String args[]) {
		int n,input,r,res = 0;
		n=4;
		input=10;
		
		while(input>0)
		{
			r = input%n;
			input = input/n;
			res = r+ (res*10);
		}
		System.out.println(res);
	}
}
