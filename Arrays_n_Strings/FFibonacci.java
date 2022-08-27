package shuruu;
import java.util.Scanner;
public class FFibonacci {
	public static void fib(int n) {
		int a=0,b=1,c=-1;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
		}
		
	}
	
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		fib(n);
		
	}

}
