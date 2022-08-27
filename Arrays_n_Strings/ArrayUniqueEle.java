package shuruu;

import java.util.Scanner;

public class ArrayUniqueEle {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>0)
				System.out.println("unique ele is: "+arr[i]);
		}
	}

}
