package shuruu;

import java.util.Scanner;

public class twoDArray {
	
	public static void main(String args[]) {
		int n,i,a,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("enter the search element: ");
		a=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
			if(arr[i][j]==a)
				System.out.println("found in loc: "+i+" "+j);
			
		}
		}
		
	}


}
