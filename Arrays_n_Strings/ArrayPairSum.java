package shuruu;

import java.util.Scanner;

public class ArrayPairSum {
	public static void main(String args[]) {
		int n,j,i,a,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==a) {
					count+=1;
				}
			}
		}
		System.out.println("nof pairs are: "+count);
		
	}

}
