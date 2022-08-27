package shuruu;

import java.util.Scanner;

//Take an array of Strings input from the user & 
//find the cumulative (combined) length of all those strings.
public class String1 {
	public static void main(String args[]) {
		String a1,a2,a3;
		Scanner sc=new Scanner(System.in);
		a1=sc.nextLine();
		a2=sc.nextLine();
		
		a3=a1+a2;
		System.out.println("length of combined str is: "+a3.length());
	}

}
