package task;

import java.util.Arrays;

public class even_odd_elements {
	public static void main(String args[]) {
		int[] arr = new int[5];
		for (int i =0 ;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("even numbers from the array are : ");
		for (int i:arr) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("odd numbers from the array are : ");
		for (int i:arr) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
