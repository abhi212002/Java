package Recursion;

public class Sum {
public static void summ(int n,int sum1){
        
        if(n==0){
        System.out.println(sum1);
        return;
        }
        
        sum1+=n;
        summ(n-1,sum1);
    }
    
	public static void main(String[] args) {
	    int n=5;
	    summ(n,0);
		
	}

}
