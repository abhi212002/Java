//Minimum jumps to reach nth Stair using 1, 2 or 3 steps
public class Main
{
    public static int mn(int n){
        int a[]=new int [n+1];
        if(n==0)
            return 0;
        if(n==1||n==2||n==3){
            return 1;
        }
        if(a[n]==0){
            a[n]=1+Math.min(Math.min(mn(n-1),mn(n-2)),mn(n-3));
        }
        return a[n];
    }
    
	public static void main(String[] args) {
	    int n=4;
		System.out.println("Min steps taken: "+mn(n));
	}
}
