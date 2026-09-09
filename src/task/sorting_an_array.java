package task;

import java.util.Arrays;

public class sorting_an_array {
	public static void main(String args[]) {
		int[] arr = new int[5];
		int temp = 0;
		for (int i =0 ;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		for (int i =0;i<arr.length;i++) {
			for (int j = i+1;j<arr.length;j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sorted array : "+Arrays.toString(arr));
}}
