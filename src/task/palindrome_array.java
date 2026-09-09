package task;

import java.util.Arrays;

public class palindrome_array {
	public static void main(String args[]) {
		int[] arr = new int[5];
		int[] arr1 = new int[5];
		for (int i =0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*10);
		}
		System.out.println("array :"+Arrays.toString(arr));
		for (int i =arr.length-1;i>=0;i--) {
			arr1[4-i] = arr[i];
		}
		System.out.print("reverse of array: "+Arrays.toString(arr1));
	}
}
