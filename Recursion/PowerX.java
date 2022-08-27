package Recursion;

public class PowerX {
	public static int po(int x,int y) {
		if(x==0) {
			return 0;
		}
		if(y==0) {
			return 1;
		}
		int xym1=po(x,y-1);
		int xy=x*xym1;
		return xy;
	}
	
	
	public static void main(String args[]) {
		int x=4,y=5;
		int ans =po(x,y);
		System.out.print(ans);
	}

}
