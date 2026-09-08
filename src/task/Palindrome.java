package task;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter the Number: ");
       int number = scanner.nextInt();
       int reverse = 0;
       int originalNumber = number;

       while(number!=0){
           int digit = number%10;
           reverse = reverse*10 + digit;
           number = number/10;
       }
        if (reverse == originalNumber) {
            System.out.println(originalNumber + " is a Palindrome");
        } else {
            System.out.println(originalNumber + " is not a Palindrome");
        }


    }
}
