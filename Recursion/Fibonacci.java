package Recursion;

public class Fibonacci {
	public static void fib(int i,int j,int n) {
		
		if(n==0) {
			return;
		}
		int a=j+i;
		System.out.print(a+" ");
		fib(j,a,n-1);
	}
	
	public static void main(String args[]) {
		int n=5;
		System.out.print("1 ");
		fib(0,1,n);
	}
}
