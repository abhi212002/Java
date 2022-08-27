package Recursion;

//given a string..place all 'x' at end of list
public class x_AtEndOfString {
	public static void place(String s,int idx,int count, String a) {
		if(idx==s.length()) {
			for(int i=0;i<count;i++) {
				a+='x';
			}
			System.out.println(a);
			return;
		}
		
		char c=s.charAt(idx);
		if(c=='x') {
			count++;
			place(s,idx+1,count,a);
		}
		else {
			a+=c;
			place(s,idx+1,count,a);
		}
	}
	
	public static void main(String args[]) {
		String s="axbhxxi";
		place(s,0,0,"");
	}

}
