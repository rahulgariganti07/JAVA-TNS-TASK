package task;

import java.util.Arrays;

public class largest_element {
	public static void main(String args[]) {
		int[] arr = new int[5];
		int largest = 0;
		for (int i =0 ;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for (int i : arr) {
			if (largest < i) {
				largest = i;
			}}
		System.out.print("largest element in array is "+largest);
	}
}
