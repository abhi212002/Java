package Placement_Ques;

public class Josephus {
	//recursion
	public static int jp(int n,int k) {
		if(n==1) {
			return 1;
		}
		return(jp(n-1,k)+k-1)%n+1;
	}
	
	public static void main(String args[]) {
		int n=14;
		int k=2;
		System.out.println(jp(n,k));
	}

}
