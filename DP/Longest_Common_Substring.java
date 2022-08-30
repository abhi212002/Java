package DP;

public class Longest_Common_Substring {
	public static int lcs(String s1,String s2,int n, int m) {
		if(n==0||m==0) {
			return 0;
		}
		int[][]a=new int[n+1][m+1];
		int x=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					a[i][j]=1+a[i-1][j-1];
					x=Math.max(x, a[i][j]);
				}
				else {
					a[i][j]=0;
				}
			}
		}
		return x;
	}
	
	public static void main(String args[]) {
		String s1="abdc";
		String s2="abcab";
		int n=s1.length();
		int m=s2.length();
		
		System.out.println(lcs(s1,s2,n,m));
	}
}
