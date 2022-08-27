package shuruu;

import java.util.Scanner;

public class Fgcd {
	
	public static void gcd(int a,int b) {
		int gc=1;
		for(int i=1;i<a && i<b;i++) {
			if(a%i==0 && b%i==0) {
				gc=i;
			}
			
		}
		System.out.println(gc);
	}
	public static void main(String args[]) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		gcd(n,m);
	}

}
