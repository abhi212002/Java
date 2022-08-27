package shuruu;

public class StringRemoveConsegutiveDup {
	public static void main(String args[]) {
		
	
	int i=0;
	String s="aabcccdd";
	String z= "";
	
	while(i<s.length()) {
		char c=s.charAt(i);
		int q=i+1;
		while(q<s.length() && s.charAt(q)==c) {
			q+=1;
		}
		z+=c;
		i=q;
	}
	System.out.println(z);

}
}