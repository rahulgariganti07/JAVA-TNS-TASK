package task;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();
        if(num%2!=0){
            System.out.println("The Number "+num+" Odd");
        }
        else{
            System.out.println("The Number "+num+" Even");
        }
    }
}
