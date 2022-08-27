package shuruu;

public class StringCheckPermutation {
	public static void main(String args[]) {
		int n,i,j;
		boolean b=true;
		String a1="abcac";
		String a2="cacba";
		int fre[]=new int[256];
		if(a1.length()!=a2.length()) {
			b=false;
		}
		else {
			for(i=0;i<a1.length();i++) {
				char ch=a1.charAt(i);
				++fre[ch];				
			}
			for(i=0;i<a2.length();i++) {
				char ch=a2.charAt(i);
				--fre[ch];			
			}
		}
		for(i=0;i<256;i++) {
			if(fre[i]!=0) {
				b=false;
			}
		}
		System.out.println(b);
	}
}
