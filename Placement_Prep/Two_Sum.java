package Placement_Ques;

import java.util.Arrays;

//Given an array A[] and a number n, check for pair in A[] with sum as n
public class Two_Sum {
	
	public static boolean ts(int n, int A[]) {
		int l=0,r=A.length-1;
		Arrays.sort(A);
		while(l<r) {
			if(A[l]+A[r]==n) {
				return true;
			}
			else if(A[l]+A[r]<n) {
				l++;
			}
			else if(A[l]+A[r]>n) {
				r--;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		int A[]={1, 4, 45, 6, 10, -8};
		int n=16;
		//int n=15;
		System.out.println(ts(n,A));
		
	}

}
