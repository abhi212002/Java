package shuruu;

import java.util.Scanner;

public class Fpower {
	public static void pow(int a, int b){
		int c=1;
		for(int i=1;i<b+1;i++) {
			c=c*a;
		}
		System.out.println("a^b= "+c);
	}
	
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		pow(a,b);
	}

}
