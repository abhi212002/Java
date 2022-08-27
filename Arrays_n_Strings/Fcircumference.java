package shuruu;

import java.util.Scanner;

public class Fcircumference {
	public static void circum(int r) {
		double a=3.14 * 2 * r;
		System.out.println("circum of sarkle is: "+a);
	}
	
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		circum(n);
	}

}
