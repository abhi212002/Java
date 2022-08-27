package shuruu;
/*Write a program to enter the numbers till the user wants and at the 
end it should display the count of positive, negative and zeros entered*/
//not full soln
import java.util.Scanner;

public class FnumberCount {
	
//	public static int positive(int n) {
//		int count=1;
//		count++;
//		return 0;
//	}
//	public static int negative(int n) {
//		int count=1;
//		count++;
//		return 0;
//	}
	
	public static void cal(int n) {
		int cp=0,cn=0;
		if(n>0) {
			cp=cp+1;
		}
		else
			cn=cn+1;
		System.out.println("+ve= "+cp+" -ve= "+cn);
	}
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0) {
			cal(n);
			n=sc.nextInt();
		}
		
	
	}

}
