package shuruu;

import java.util.Scanner;

public class FgreatestOfTwo {
	
	public static void great(int a,int b) {
		if(a>b)
			System.out.println(a+ " is greater");
		else if(a<b)
			System.out.println(b+ " is greater");
		else
			System.out.println(a+" and "+b+"are equal");
	}
	
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		great(a,b);
		
	}

}
