package shuruu;
//Input an email from the user. You have to create a username from the 
//email by deleting the part that comes after ‘@’. Display that username to the user.
import java.util.Scanner;
public class String3 {
	public static void main(String args[]) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='@') {
				break;
			}
			else {
				b+=a.charAt(i);
			}
		}
		System.out.println("username is: "+b);
	}

}
