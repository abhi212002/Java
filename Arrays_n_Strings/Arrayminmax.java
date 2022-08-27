package shuruu;
//Find the maximum & minimum number in an array of integers. 
public class Arrayminmax {
	public static void main(String args[]) {
		int min,max;
		int arr[]= {10,20,30,40,50};
		max= Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max: "+max+"\n"+"min: "+min);
	}

}
