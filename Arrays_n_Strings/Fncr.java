package shuruu;

import java.util.Scanner;

public class Fncr {
	
	public static int fact(int a) {
		int f=1;
		for(int i=1;i<a+1;i++) {
			f=f*i;
		}
		return f;
		
	}
	
	public static void main(String args[]) {
		int n,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		r=sc.nextInt();
		
		int nf=fact(n);
		int rf=fact(r);
		int nrf=fact(n-r);
		System.out.println("nCr "+(nf/(rf*nrf)));
	}

}
