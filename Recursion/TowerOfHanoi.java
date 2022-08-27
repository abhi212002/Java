package Recursion;

public class TowerOfHanoi {
	
	public static void hanoi(int n, String src,String help, String dest) {
		if(n==1) {
			System.out.println("transfered "+ n+ " from "+src+" to "+dest);
			return;
		}
		
		hanoi(n-1,src,dest,help);
		System.out.println("transfered "+ n+ " from "+src+" to "+dest);
		hanoi(n-1,help,src,dest);
	}
	
	public static void main(String args[]) {
		int n=2;
		hanoi(n,"S","H","D");
	}

}
