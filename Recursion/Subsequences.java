package Recursion;

public class Subsequences {
	
	public static void subs(String s, int i, String ns) {
		if(i==s.length()) {
			System.out.println(ns);
			return;
		}
		char c=s.charAt(i);
		//to be
		subs(s,i+1,ns+c);
		
		//not to be
		subs(s,i+1,ns);
	}
	
	public static void main(String args[]) {
		String s="abhi",a="";
		subs(s,0,a);
	}

}
