package shuruu;

import java.util.Scanner;

public class FSumOfOdd {
	public static void SumOdd(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd num is: "+sum);
	}
	
	
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		SumOdd(n);
	}

}
