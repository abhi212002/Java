package DP;
//Minimum operations required to transform String - 1 to String - 2
public class Edit_Distance {
	public static int lcs(String s1,String s2,int n, int m) {
		if(n==0&&m==0) {
			return 0;
		}
		if(n==0)
			return m;
		if(m==0)
			return n;
		int[][]a=new int[n+1][m+1];
		for(int i=0;i<=m;i++) {
			a[0][i]=i;
		}
		for(int i=0;i<=n;i++) {
			a[i][0]=i;
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					a[i][j]=a[i-1][j-1];
					
				}
				else {
					a[i][j]= 1+Math.min(Math.min(a[i][j-1], a[i-1][j-1]), a[i-1][j-1]);
				}
				
			}
		}
		return a[n][m];
	}
	
	public static void main(String args[]) {
		String s1="ab";
		String s2="abc";
		int n=s1.length();
		int m=s2.length();
		
		System.out.println(lcs(s1,s2,n,m));
	}
}
