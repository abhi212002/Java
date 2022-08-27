package shuruu;
import java.util.*;
public class EveOddSum {
	public static void main(String args[]) {
		int n,evesum=0,oddsum=0;
		Scanner sc=new Scanner(System.in) ;
		n=sc.nextInt();
		while(n>=1) {
			
		
			int i=n%10;
			if(i%2==0) {
				evesum=evesum+i;
			}
			else {
				oddsum=oddsum+i;
			}
			n=n/10;
			
		}
		System.out.print("oddsum= "+oddsum+"\n"+ "evesum= "+evesum);
	}

}
