package task;

import java.util.Scanner;
public class Largest_3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = scanner.nextInt();

        if(a>b&&a>c){
            System.out.println(a+" is Greater than "+b+" and "+c);
        }
        else if (b>a&&b>c){
            System.out.println(b+" is Greater than "+a+" and "+c);
        }
        else {
            System.out.println(c+" is Greater than "+a+" and "+b);
        }
    }
}
