package DP;
//print the nth fibonacci number
public class Fibonacci {
	public static void main(String args[]) {

		//Tabulated_version
		int n=10;
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println(a[n-1]);
	}

}
