
package shuruu;
import java.util.*;
public class TotSalary {
	public static void main(String[] args) {
	double b,h,d,p,tot;
	String g;
	Scanner sc=new Scanner(System.in);
	g=sc.next();
	b=sc.nextDouble();
	h=0.2*b;
	d=0.5*b;
	p=0.11*b;
	
	if(g=="A")
		tot=b+1700;
	else if(g=="B")
		tot=b+1500;
	else
		tot=b+1300;
	
	tot=tot+p+d+h;
	System.out.print("Totsalary= "+tot);
	

}
}