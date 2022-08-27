package shuruu;
import java.util.Scanner;
public class Fvote {
	
	public static void vote(int a) {
		if(a>17) {
			System.out.println("elgible ");
		}
		else
			System.out.println("not elgible ");
	}
	public static void main(String args[]) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		vote(a);
	}

}
