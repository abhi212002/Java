package Recursion;
//print 1st and last occurrence of given element in a string

public class FirstAndLastOccur {
	public static int f=-1;
	public static int l=-1;
	
	public static void occr(String s,int idx, char ele) {
		if(idx==s.length()) {
			System.out.println("first occr= "+f);
			System.out.println("last occr= "+l);
			return;
		}
		if(s.charAt(idx)==ele) {
			if(f==-1) {
				f=idx;
			}
			else {
				l=idx;
			}
		}
		occr(s,idx+1,ele);
		
	}
	
	public static void main(String args[]) {
		String s="abhinav";
		occr(s,0,'a');
	}

}
