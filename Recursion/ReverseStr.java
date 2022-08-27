package Recursion;

public class ReverseStr {
	
	public static void rev(int a,String s) {
		if(a==0) {
			System.out.print(s.charAt(a));
			return;
		}
		
		
		System.out.print(s.charAt(a));
		rev(a-1,s);
	}
	public static void main(String args[]) {
		String s="abcd";
		rev(s.length()-1,s);
	}

}
