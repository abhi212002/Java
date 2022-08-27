package shuruu;
//Input a string from the user. Create a new string called ‘result’ in which you will 
//replace the letter ‘e’ in the original string with letter ‘i’.
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”
import java.util.Scanner;
public class String2 {
	public static void main(String args[]) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='e') {
				b+='i';	
			}
			else {
				b+=a.charAt(i);
				
			}
		}
		System.out.println("new str is: "+b);
	}

}
