package shuruu;
//Take an array of numbers as input and check if it is an array sorted in ascending order.
public class ArrayCheckAss {
	public static void check(int arr[]) {
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				flag=false;
				
			
		}if(flag)
			System.out.println("assending");
		else
			System.out.println("not assending");
			
	}
	
	public static void main(String args[]) {
		
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {20,10,30,40,50};
		check(arr1);
		check(arr2);
	}

}
