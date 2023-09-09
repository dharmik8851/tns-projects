package ArrayDemo;

import java.util.Arrays;



public class ArrayDemo {
	
	int getSum(int... n){
		int sum=0;
		for(int no : n)
			sum += no;
		return sum;
	}

	
	public static void main(String[] args) {
		int arr[] = {11,2,30};
		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		int idx = Arrays.binarySearch(arr, 0);
//		int arr2[] = {11,2,35};
//		System.out.println(Arrays.compare(arr, arr2));
//		int arr3[] = Arrays.copyOfRange(arr2, 0, 2);
//		System.out.println(Arrays.toString(arr3));
//		Arrays.fill(arr3, 8);
//		System.out.println(Arrays.toString(arr3));
		
		//multidimensional array
		int[][] arr2 = {{12,34},{43,56},{1,2,3}};
		//new int[3][2];
		for(int[] row : arr2) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
		
	}
}