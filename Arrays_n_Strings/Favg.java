package shuruu;

import java.util.Scanner;

public class Favg {
	public static void avg(int a,int b,int c) {
		int avg=(a+b+c)/3;
		System.out.println("Avg= "+avg);
	}
	
	
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		avg(a,b,c);
	}

}
