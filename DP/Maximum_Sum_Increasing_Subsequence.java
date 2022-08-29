//Maximum Sum Increasing Subsequence

public class Main
{
    public static int ms(int[]n){
        int[] a=new int[n.length];
        for(int i=0;i<n.length;i++){
            a[i]=n[i];
        }
        int m=a[0];
        for(int i=1;i<n.length;i++){
            for(int j=0;j<i;j++){
                if(n[i]>n[j]&&n[i]+a[j]>a[i]){
                    a[i]=a[j]+n[i];
                    m=Math.max(m,a[i]);
                }
            }
        }
        return m;
    }
    
	public static void main(String[] args) {
	    int n[]={7,1,4,8,11,2,14,3};
      System.out.println("max sum is: "+ms(n));
	}
}
