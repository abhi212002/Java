package Recursion;

public class Factorial {
	public static void factu(int n, int fact) {
		if(n==0) {
			System.out.println(fact);
			return;
		}
		fact=fact*n;
		factu(n-1,fact);
		
	}
	
	public static void main(String args[]) {
		int n=5;
		factu(n,1);
	}
}
