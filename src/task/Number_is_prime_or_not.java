package task;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Number_is_prime_or_not {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if(number<2){
            isPrime = false;
        }

        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0) {

                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The Number you have Entered " + number + " is a prime Number ");
        }
        else{
            System.out.println("The Number you have Entered " + number + " is not a prime Number ");
        }

    }
}