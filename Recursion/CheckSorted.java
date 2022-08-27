package Recursion;

public class CheckSorted {
	public static boolean sor(int a[],int idx) {
		if(idx==a.length-1) {
			return true;
		}
		if(a[idx]<a[idx+1]) {
			return sor(a,idx+1);
		}
		else
			return false;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,32,4,5};
		System.out.println(sor(arr,0));
	}

}
