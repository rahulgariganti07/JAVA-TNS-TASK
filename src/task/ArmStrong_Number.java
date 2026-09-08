package task;

import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number!=0){
            int digit = number%10;
            sum += Math.pow(digit,digits);
            number = number/10;
        }
        if(sum == originalNumber){
            System.out.println("The Given Number "+originalNumber+" is ArmStrong Number");
        }
        else{
            System.out.println("The Given Number "+originalNumber+" is not a ArmStrong Number");
        }
    }
}
