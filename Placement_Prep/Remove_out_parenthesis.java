package Placement_Ques;
//import java.util.*;
public class Remove_out_parenthesis {
	
	public static String Remo(String s) {
		String a="";
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==41) {
				j--;
			}
			if(j!=0)
				a=a+s.charAt(i);
			if(s.charAt(i)==40) {
				j++;
			}
		}
		return a;
	}
	
	public static void main(String args[]) {
		String s="(()())(())";
		String x=Remo(s);
		System.out.println(x);
	}
	

}
