package shuruu;

import java.util.Scanner;

public class ArrayFindDup {
	public static void main(String args[]) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		//scan
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]==a[j])
					System.out.println("dup ele is: "+a[i]);
			}
		}
	}

}
