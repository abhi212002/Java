package shuruu;
//array search basic AKA linear search
import java.util.Scanner;

public class Array1 {
	public static void main(String args[]) {
		int n,i,a;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the search element: ");
		a=sc.nextInt();
		for(i=0;i<n;i++) {
			if(arr[i]==a)
				System.out.println("found in loc: "+i);
			
		}
		
	}

}
