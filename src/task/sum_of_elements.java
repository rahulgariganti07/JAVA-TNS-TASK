package task;

import java.util.Arrays;

public class sum_of_elements {
	public static void main(String args[]) {
		int[] arr = new int[5];
		int sum = 0;
		for (int i =0 ;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for (int i: arr) {
			sum = sum+i;
		}
		System.out.print("sum of all elements in array is equals to "+sum);
	} }
