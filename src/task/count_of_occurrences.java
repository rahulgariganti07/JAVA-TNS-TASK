package task;

import java.util.Arrays;

public class count_of_occurrences {
	public static void main(String args[]) {
		int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5);
        }
        
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++; 
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }}}
